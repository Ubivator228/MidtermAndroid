package com.example.myhobbyapp.domain.usecase

import com.example.myhobbyapp.domain.repository.HobbyRepository

class GetHobbiesUseCase(private val repository: HobbyRepository) {
    operator fun invoke() = repository.getHobbies()
}