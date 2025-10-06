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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Scaffold { paddingValues ->
                Greeting(
                    modifier = Modifier.padding(paddingValues),
                    text = "Hello World! Hello World!"
                )
            }

        }
    }

    @Composable
    private fun Greeting(
        modifier: Modifier = Modifier,
        text: String
    ) {

        val words = text.split(" ").map { word ->
            word.filter { it.isLetter() }.uppercase()
        }

        val green = Color(0xFF79A86A)
        val white = Color(0xFFFFFFFF)
        val grey = Color(0xFF797D80)
        val yellow = Color(0xFFC6B567)

        Column(
            modifier = modifier
                .fillMaxWidth()
                .background(white)
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            words.forEachIndexed { rawIndex, word ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    for (char in word) {
                        val color = if (rawIndex % 2 == 0) {
                            val isYellow = Random.nextBoolean()
                            if (isYellow) {
                                yellow
                            } else {
                                grey
                            }
                        } else {
                            green
                        }
                        Box(
                            modifier = Modifier
                                .background(color = color)
                                .fillMaxWidth()
                                .weight(1f)
                                .aspectRatio(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = char.toString(),
                                fontSize = 32.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = white,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }

}
