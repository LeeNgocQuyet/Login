package com.example.login.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.filled.Email

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun NewPasswordScreen(navController: NavController,
                      vm: AuthViewModel = viewModel()) {
    var password by rememberSaveable { mutableStateOf("") }
    var verificatePassword by rememberSaveable { mutableStateOf("") }
    Column() {
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Tài khoản") },
            leadingIcon = {
                Icon(Icons.Default.Email, contentDescription = null)
            }
        )

        OutlinedTextField(
            value = verificatePassword,
            onValueChange = { verificatePassword = it },
            label = { Text("Tài khoản") },
            leadingIcon = {
                Icon(Icons.Default.Email, contentDescription = null)
            })

        Button(onClick ={

        } ) {
            Text(text = "Xác nhận")
        }

        Button(onClick ={
             navController.navigate("login")
        } ) {
            Text(text = "Quay lại trang Đăng nhập")
        }

    }
}