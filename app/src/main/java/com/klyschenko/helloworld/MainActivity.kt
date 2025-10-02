package com.klyschenko.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val characters = "Hello world!".filter {
            it.isLetter()
        }
        val firstRow = characters.take(5)
        val secondRow = characters.takeLast(5)
        setContent {
            Column(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth()
                    .background(Color.Magenta)
                    .padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    for (char in firstRow) {
                        Box(
                            modifier = Modifier
                                .background(color = Color.Green)
                                .fillMaxWidth()
                                .weight(1f)
                                .aspectRatio(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = char.toString(),
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.Blue,
                                fontSize = 15.sp,
                                letterSpacing = 1.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    for (char in secondRow) {
                        Box(
                            modifier = Modifier
                                .background(color = Color.Green)
                                .fillMaxWidth()
                                .weight(1f)
                                .aspectRatio(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = char.toString(),
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.Blue,
                                fontSize = 15.sp,
                                letterSpacing = 1.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}
