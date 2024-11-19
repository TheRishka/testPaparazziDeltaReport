package com.example.test_paparazzi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class PaparazziScreenshotDeltaTest {

    @get:Rule
    val paparazzi = Paparazzi()

    @Test
    fun sampleTest() {
        paparazzi.snapshot {
            Box(
                modifier = Modifier
                    .size(width = 320.dp, height = 560.dp)
                    .background(color = Color.White)
            ) {
                Text("Hello Brother")
            }
        }
    }
}