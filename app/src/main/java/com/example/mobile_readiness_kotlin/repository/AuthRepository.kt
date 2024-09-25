package com.example.mobile_readiness_kotlin.repository

import android.util.Log
import com.example.mobile_readiness_kotlin.data.api.AuthService
import com.example.mobile_readiness_kotlin.data.models.LoginRequest
import com.example.mobile_readiness_kotlin.data.models.RequestTokenBody
import com.example.mobile_readiness_kotlin.data.models.RequestTokenResponse
import com.example.mobile_readiness_kotlin.data.models.SessionResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AuthRepository(
    private val apiService: AuthService,
    private val apiKey: String,
) {
    fun createRequestToken(callback: (RequestTokenResponse?) -> Unit) {
        apiService.createRequestToken(apiKey)
            .enqueue(object : retrofit2.Callback<RequestTokenResponse> {
                override fun onResponse(
                    call: Call<RequestTokenResponse>,
                    response: Response<RequestTokenResponse>,
                ) {
                    if (response.isSuccessful) {
                        val requestTokenResponse = response.body()
                        callback(requestTokenResponse)
                    } else {
                        Log.v("requestToken", "Error in ${response.code()} - ${response.message()}")
                        callback(null)
                    }
                }

                override fun onFailure(call: Call<RequestTokenResponse>, t: Throwable) {
                    Log.v(t.toString(), "Network error in createRequestToken")
                    callback(null)
                }
            })
    }

    fun validateRequestToken(
        username: String,
        password: String,
        requestToken: String,
        callback: (RequestTokenResponse?) -> Unit,
    ) {
        val loginData = LoginRequest(username, password, requestToken)
        val call = apiService.validateTokenWithLogin(apiKey, loginData)
        call.enqueue(object : Callback<RequestTokenResponse> {
            override fun onResponse(
                call: Call<RequestTokenResponse>,
                response: Response<RequestTokenResponse>,
            ) {
                if (response.isSuccessful) {
                    callback(response.body())
                } else {
                    Log.v(
                        "validateRequestToken",
                        "Error in ${response.code()} - ${response.message()}"
                    )
                    callback(null)
                }
            }

            override fun onFailure(call: Call<RequestTokenResponse>, t: Throwable) {
                Log.v(t.toString(), "Network error in validateRequestToken")
                callback(null)
            }
        })
    }

    fun createSession(requestToken: String, callback: (SessionResponse?) -> Unit) {
        val requestBody = RequestTokenBody(requestToken)
        val call = apiService.createSession(apiKey, requestBody)
        call.enqueue(object : Callback<SessionResponse> {
            override fun onResponse(
                call: Call<SessionResponse>,
                response: Response<SessionResponse>,
            ) {
                if (response.isSuccessful) {
                    callback(response.body())
                } else {
                    Log.v("createSession", "Error in ${response.code()} - ${response.message()}")
                    callback(null)
                }
            }

            override fun onFailure(call: Call<SessionResponse>, t: Throwable) {
                Log.v(t.toString(), "Network error in createSession")
                callback(null)
            }
        })
    }

}


