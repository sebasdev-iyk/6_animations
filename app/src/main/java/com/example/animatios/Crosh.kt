package com.example.animatios

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import com.example.animatios.screens.HomeScreen
import com.example.animatios.screens.WellcomeScreen

@Composable
fun MyCrossfade(modifier: Modifier = Modifier) {
    var currentScreen by remember { mutableStateOf("Welcome") }

    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 60.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Welcome",
                modifier = Modifier.clickable { currentScreen = "Welcome" }
            )
            Text(
                text = "Home",
                modifier = Modifier.clickable { currentScreen = "Home" }
            )
        }

        Crossfade(targetState = currentScreen) { screen ->
            when (screen) {
                "Welcome" -> WellcomeScreen()
                "Home" -> HomeScreen()
            }
        }
    }
}