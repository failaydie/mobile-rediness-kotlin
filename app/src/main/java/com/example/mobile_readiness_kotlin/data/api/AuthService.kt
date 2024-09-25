package com.example.mobile_readiness_kotlin.data.api

import com.example.mobile_readiness_kotlin.data.models.DeleteSessionResponse
import com.example.mobile_readiness_kotlin.data.models.LoginRequest
import com.example.mobile_readiness_kotlin.data.models.RequestTokenBody
import com.example.mobile_readiness_kotlin.data.models.RequestTokenResponse
import com.example.mobile_readiness_kotlin.data.models.SessionDeleteBody
import com.example.mobile_readiness_kotlin.data.models.SessionResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface AuthService {
    @GET("authentication/token/new")
    fun createRequestToken(@Query("api_key") apiKey: String): Call<RequestTokenResponse>

    @POST("authentication/token/validate_with_login")
    fun validateTokenWithLogin(
        @Query("api_key") apiKey: String,
        @Body loginData: LoginRequest,
    ): Call<RequestTokenResponse>

    @POST("authentication/session/new")
    fun createSession(
        @Query("api_key") apiKey: String,
        @Body requestToken: RequestTokenBody,
    ): Call<SessionResponse>

    @DELETE("authentication/session")
    fun deleteSession(
        @Query("api_key") apiKey: String,
        @Body session: SessionDeleteBody,
    ): Call<DeleteSessionResponse>
}