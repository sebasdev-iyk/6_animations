package com.example.laboratorios.animaciones

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
fun fullAnimateAsState(modifier: Modifier = Modifier) {
    var isSelected by remember { mutableStateOf(false) }
    val animatedColor by animateColorAsState(
        targetValue = if (isSelected) Color.Red else Color.Blue
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(Modifier.height(32.dp))
        Button(onClick = { isSelected = !isSelected }) {
            Text(text = "Seleccionar")
        }
        Spacer(Modifier.height(32.dp))
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(animatedColor)
        )
    }
}