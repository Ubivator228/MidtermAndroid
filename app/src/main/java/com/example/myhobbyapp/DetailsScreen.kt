package com.example.myhobbyapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text(text = "Моя камера", style = MaterialTheme.typography.headlineLarge)

        Text(
            text = "Я использую камеру Sony A7III с объективами 50mm f/1.8 и 24-70mm f/2.8. Также у меня есть дрон DJI Mavic Air 2.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Назад")
        }
    }
}
