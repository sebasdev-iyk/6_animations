package com.example.laboratorios.animaciones

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AnimatedDpExample() {
    var expand by remember { mutableStateOf(false) }

    val animatedWidth by animateDpAsState(
        targetValue = if (expand) 200.dp else 100.dp,
        label = "Width Animation"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = { expand = !expand }) {
            Text(text = if (expand) "Reducir" else "Expandir")
        }

        Spacer(modifier = Modifier.height(50.dp))

        Box(
            modifier = Modifier
                .size(height = 100.dp, width = animatedWidth)
                .background(Color.Blue)
        )
    }
}