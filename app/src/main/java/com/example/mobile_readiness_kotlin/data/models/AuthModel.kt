package com.example.mobile_readiness_kotlin.data.models

import com.google.gson.annotations.SerializedName

data class RequestTokenResponse(
    val success: Boolean,
    @SerializedName("expires_at") val expiresAt: String,
    @SerializedName("request_token") val requestToken: String,
)

data class LoginRequest(
    val username: String,
    val password: String,
    @SerializedName("request_token") val requestToken: String,
)

data class RequestTokenBody(
    @SerializedName("request_token") val requestToken: String,
)

data class SessionResponse(
    val success: Boolean,
    @SerializedName("session_id") val sessionId: String,

    )

data class SessionDeleteBody(
    @SerializedName("session_id") val sessionId: String,
)

data class DeleteSessionResponse(
    val success: Boolean,
)