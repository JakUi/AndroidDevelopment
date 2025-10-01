package com.klyschenko.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(
                modifier = Modifier
                    .width(100.dp)
                    .background(color = Color.Green)
                    .padding(top = 32.dp, start = 16.dp, end  = 16.dp),
                text="Hello world!",
                fontWeight = FontWeight.ExtraBold,
                color = Color.Blue,
                fontSize = 20.sp,
                letterSpacing = 24.sp
                )
        }
        println("Hello world!")
    }
}