package com.example.mobile_readiness_kotlin.ui.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class LoginViewModel : ViewModel(){
    private val _username = MutableStateFlow("")
    private val _password = MutableStateFlow("")
    private val _isPasswordVisible = MutableStateFlow(false)
    private val _errorMessage = MutableStateFlow<String?>(null)

    val username: StateFlow<String> = _username
    val password: StateFlow<String> = _password
    val isPasswordVisible: StateFlow<Boolean> = _isPasswordVisible
    val errorMessage: StateFlow<String?> = _errorMessage

    fun onUsernameChange(username: String){
        _username.update { username }
    }

    fun onPasswordChange(password: String){
        _password.update { password }
    }

    fun togglePasswordVisibility() {
        _isPasswordVisible.update { !it }
    }

    fun onClicked(){
        if(_username.value.isEmpty() || _password.value.isEmpty()){
            _errorMessage.update { "username or password cant be empty" }
        } else {
            _errorMessage.update { null }
        }
    }

}