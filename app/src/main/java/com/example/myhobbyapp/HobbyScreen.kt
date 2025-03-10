package com.example.myhobbyapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HobbyScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text(text = "Мое хобби – Теннис", style = MaterialTheme.typography.headlineLarge)

        Image(
            painter = painterResource(id = R.drawable.camera), // Добавь изображение в res/drawable
            contentDescription = "Camera",
            modifier = Modifier.fillMaxWidth().height(200.dp).clip(RoundedCornerShape(16.dp))
        )

        Text(
            text = "Я увлекаюсь теннисом уже 5 лет. Люблю играть.",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Button(
            onClick = { navController.navigate("details") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Подробнее")
        }
    }
}
