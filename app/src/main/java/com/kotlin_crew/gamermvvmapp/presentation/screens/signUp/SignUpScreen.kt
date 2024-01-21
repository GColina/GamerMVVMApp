package com.kotlin_crew.gamermvvmapp.presentation.screens.signUp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kotlin_crew.gamermvvmapp.R
import com.kotlin_crew.gamermvvmapp.presentation.components.DefaultTopBar
import com.kotlin_crew.gamermvvmapp.presentation.screens.signUp.components.SignUpContent
import com.kotlin_crew.gamermvvmapp.presentation.ui.theme.GamerMVVMAppTheme

@Composable
fun SignUpScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            DefaultTopBar(
                title = stringResource(id = R.string.topAppBar_SignUp),
                upAvailable = true,
                navController = navController
            )
        },
        content = {
            SignUpContent(it)
        },
        bottomBar = {}
    )
}

@Preview
@Composable
fun PreviewSignUpScreen() {
    GamerMVVMAppTheme(darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
        ) {
            SignUpScreen(rememberNavController())
        }
    }
}