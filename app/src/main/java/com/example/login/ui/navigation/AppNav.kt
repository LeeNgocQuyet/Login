package com.example.login.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login.ui.AuthViewModel
import com.example.login.ui.ForgotPasswordScreen
import com.example.login.ui.LoginScreen
import com.example.login.ui.NewPasswordScreen
import com.example.login.ui.RegisterScreen

@Composable
fun AppNav() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "login") {

        composable("login") {
            LoginScreen(navController)
        }

        composable("register") {
            RegisterScreen(navController)
        }

        composable("forgot") {
            ForgotPasswordScreen(navController)
        }

        composable("new_password") {
            NewPasswordScreen(navController)
        }
    }
}