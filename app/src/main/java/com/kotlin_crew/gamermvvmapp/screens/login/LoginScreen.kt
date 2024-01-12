package com.kotlin_crew.gamermvvmapp.screens.login

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kotlin_crew.gamermvvmapp.R
import com.kotlin_crew.gamermvvmapp.screens.login.components.LoginBottomBar
import com.kotlin_crew.gamermvvmapp.screens.login.components.LoginContent

@Composable
fun LoginScreen() {

    Scaffold(
        topBar = {},
        content = {
            LoginContent(it)
        },
        bottomBar = {
            LoginBottomBar()
        })
}
@Preview
@Composable
fun ShowPreview(){
    LoginScreen()
}