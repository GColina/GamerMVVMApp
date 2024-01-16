package com.kotlin_crew.gamermvvmapp.screens.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        CardForm()
    }
}

@Composable
fun CardForm() {
    Card(modifier = Modifier.padding(start = 40.dp, end = 40.dp, top = 20.dp)) {
        Column(modifier = Modifier.padding(horizontal = 20.dp)) {
            Text(
                modifier = Modifier.padding(top = 30.dp),
                text = stringResource(id = R.string.title_login),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = stringResource(id = R.string.text_header),
                fontSize = 12.sp,
                color = Color.Gray
            )
            OutlinedTextField(modifier = Modifier.padding(top = 25.dp),
                value = "",
                onValueChange = { },
                label = { Text(text = stringResource(id = R.string.textfield_email)) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "",
                        tint = Color.White
                    )
                })

            Spacer(modifier = Modifier.height(10.dp))
            OutlinedTextField(value = "",
                onValueChange = { },
                label = { Text(text = stringResource(id = R.string.textfield_password)) },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "",
                        tint = Color.White
                    )
                })
            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 40.dp), shape = RoundedCornerShape(5.dp), onClick = { }) {
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = stringResource(id = R.string.btn_login))
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    GamerMVVMAppTheme(darkTheme = true) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
        ) {
            LoginScreen()
        }
    }
}