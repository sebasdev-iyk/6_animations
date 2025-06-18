/*package com.example.laboratorios.animaciones

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.animateOffsetAsState
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.Offset

@Composable
fun fullAnimateAsStat(modifier: Modifier = Modifier) {
    var isSelected by remember { mutableStateOf(false) }

    // Animación de color
    val animatedColor by animateColorAsState(
        targetValue = if (isSelected) Color.Red else Color.Blue,
        label = "Color Animation"
    )

    // Animación de tamaño (Dp)
    val animatedSize by animateDpAsState(
        targetValue = if (isSelected) 200.dp else 150.dp,
        label = "Size Animation"
    )

    // Animación de posición (Offset)
    val animatedOffset by animateOffsetAsState(
        targetValue = if (isSelected) Offset(x = 0f, y = 100f) else Offset(x = 0f, y = 0f),
        label = "Offset Animation"
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
                .offset(animatedOffset.x.dp, animatedOffset.y.dp) // Aplicar offset animado
                .size(animatedSize) // Aplicar tamaño animado
                .background(animatedColor) // Aplicar color animado
        )
    }
}*/