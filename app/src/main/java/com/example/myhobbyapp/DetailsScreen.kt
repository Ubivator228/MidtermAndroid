package com.example.myhobbyapp

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myhobbyapp.domain.model.Hobby

@Composable
fun DetailsScreen(hobbyId: String, viewModel: HobbyViewModel) {
    val hobbies = viewModel.hobbies.collectAsState().value
    val hobby = hobbies.find { it.id.toString() == hobbyId }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        if (hobby != null) {
            Text(
                text = "${hobby.name}: ${hobby.description}",
                style = MaterialTheme.typography.headlineSmall
            )
        } else {
            Text(text = "Hobby not found", style = MaterialTheme.typography.bodyLarge)
        }
    }
}
