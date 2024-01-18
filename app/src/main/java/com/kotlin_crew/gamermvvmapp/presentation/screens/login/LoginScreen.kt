package com.kotlin_crew.gamermvvmapp.presentation.screens.login

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kotlin_crew.gamermvvmapp.presentation.screens.login.components.LoginBottomBar
import com.kotlin_crew.gamermvvmapp.presentation.screens.login.components.LoginContent
import com.kotlin_crew.gamermvvmapp.presentation.ui.theme.GamerMVVMAppTheme

@Composable
fun LoginScreen(navController:NavHostController) {

    Scaffold(
        topBar = {},
        content = {
            LoginContent(it)
        },
        bottomBar = {
            LoginBottomBar(navController)
        })
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    GamerMVVMAppTheme(darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
        ) {
            LoginScreen(rememberNavController())
        }
    }
}