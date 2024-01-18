package com.kotlin_crew.gamermvvmapp.presentation.screens.signUp

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SignUpScreen(navController:NavHostController) {
    Scaffold(
        topBar = {},
        content = {
            Text(text = "SignUpScreen")
        },
        bottomBar = {}
    )
}