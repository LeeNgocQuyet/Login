package com.example.login.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.login.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Checkbox

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun ForgotPasswordScreen(
    navController: NavController,
    vm: AuthViewModel = viewModel()
) {
    var email by rememberSaveable { mutableStateOf("") }
    var verificateCode by rememberSaveable { mutableStateOf("") }
    Column() {
        OutlinedTextField(
        value = email,
        onValueChange = { email = it },
        label = { Text("Tài khoản") },
        leadingIcon = {
            Icon(Icons.Default.Email, contentDescription = null)
        }
    )
        Button(onClick = {}) {
            Text(text = "Gửi mã về mail")
        }
        OutlinedTextField(
            value = verificateCode,
            onValueChange = { verificateCode = it },
            label = { Text("Mã xác nhận") },
            leadingIcon = {
                Icon(Icons.Default.Email, contentDescription = null)
            })

        Button(onClick ={
            navController.navigate("new_password")
        } ) {
            Text(text = "Xác nhận")
        }

        Button(onClick ={ navController.navigate("login")} ) {
            Text(text = "Quay lại trang Đăng nhập")
        }

    }
}