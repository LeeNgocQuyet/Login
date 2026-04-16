package com.example.login.ui

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import com.example.login.data.AuthUiState


class AuthViewModel: ViewModel() {

    var uiState by mutableStateOf(AuthUiState())
        private set

    fun onUsernameChange(value: String) {
        uiState = uiState.copy(username = value)
    }

    fun onPasswordChange(value: String) {
        uiState = uiState.copy(password = value)
    }

    fun login(): Boolean {
        return uiState.username == "admin" && uiState.password == "123"
    }

    fun onCheckedChange(): Boolean {
        uiState = uiState.copy(isChecked = !uiState.isChecked)
        return uiState.isChecked
    }
}