package com.example.myhobbyapp.domain.usecase

import com.example.myhobbyapp.domain.model.Hobby
import com.example.myhobbyapp.domain.repository.HobbyRepository

class AddHobbyUseCase(private val repository: HobbyRepository) {
    suspend operator fun invoke(hobby: Hobby) = repository.addHobby(hobby)
}