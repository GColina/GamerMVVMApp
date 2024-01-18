package com.kotlin_crew.gamermvvmapp.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.kotlin_crew.gamermvvmapp.presentation.ui.theme.Red500


@Composable
fun DefaultButton(
    text: String,
    // stringResource(id = R.string.btn_login)
    onClick: () -> Unit,
    color: Color = Red500,
    icon: ImageVector = Icons.Default.ArrowForward
) {
    Button(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 40.dp),
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(color),
        onClick = { onClick() }) {
        Icon(imageVector = icon, contentDescription = "")
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = text)
    }
}