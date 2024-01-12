package com.kotlin_crew.gamermvvmapp.screens.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kotlin_crew.gamermvvmapp.R
import com.kotlin_crew.gamermvvmapp.screens.login.LoginScreen
import com.kotlin_crew.gamermvvmapp.ui.theme.GamerMVVMAppTheme

@Composable
fun LoginContent(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues = paddingValues)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.height(130.dp),
            painter = painterResource(id = R.drawable.kr_mrlogo),
            contentDescription = "KR MR logo"
        )
        Text(text = stringResource(id = R.string.app_name))

        Card() {
        }

        Text(
            modifier = Modifier.padding(top = 30.dp),
            text = stringResource(id = R.string.title_login)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = stringResource(id = R.string.text_header))
        TextField(
            modifier = Modifier.padding(top = 25.dp),
            value = "",
            onValueChange = { },
            label = { Text(text = stringResource(id = R.string.textfield_email)) })
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = "",
            onValueChange = { },
            label = { Text(text = stringResource(id = R.string.textfield_password)) })
        Button(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp, vertical = 15.dp),
            onClick = { }
        ) {
            Text(text = stringResource(id = R.string.btn_login))
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    GamerMVVMAppTheme(darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            LoginScreen()
        }
    }
}