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
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.login.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox

import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun LoginScreen(
    navController: NavController,
    vm: AuthViewModel = viewModel()) {

    Column(
    modifier = Modifier.fillMaxSize().padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image(painter = painterResource(R.drawable.plankavatar),
            "plank avatar",
            modifier = Modifier.padding(16.dp))
        OutlinedTextField(
            value = vm.uiState.username,
            onValueChange = { vm.onUsernameChange(it) },
            label = { Text("Tài khoản") },
            leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = null)
            }
        )
        OutlinedTextField(
            value = vm.uiState.password,
            onValueChange = { vm.onPasswordChange(it) },
            label = { Text("Mật khẩu") },
            leadingIcon = {
                Icon(Icons.Default.Lock, contentDescription = null)
            }
        )
        Row(){
            Checkbox(
                checked = vm.uiState.isChecked,
                onCheckedChange = { newValue ->
                    vm.onCheckedChange()
                }
            )
            Text("Ghi nhớ đăng nhập")

            Button(onClick = { navController.navigate("forgot")  }){
                Text(text = "Quên mật khẩu")
            }

        }
        Button(onClick = {
        },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Đăng nhập")
        }
        Button(onClick = {
            navController.navigate("register")
        },
            modifier = Modifier.padding(8.dp)
        ) {
            Text(text = "Sign Up")
        }
    }
}