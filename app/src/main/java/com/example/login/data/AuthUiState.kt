package com.example.login.data

data class AuthUiState(
    val username: String = "",
    val password: String = "",
    val email: String = "",
    val isLoading: Boolean = false,
    var error: String? = null,
    var isChecked: Boolean = false


) {

}