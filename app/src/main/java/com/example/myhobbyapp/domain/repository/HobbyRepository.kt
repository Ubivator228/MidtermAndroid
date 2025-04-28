package com.example.myhobbyapp.domain.repository

import com.example.myhobbyapp.domain.model.Hobby
import kotlinx.coroutines.flow.Flow

interface HobbyRepository {
    suspend fun addHobby(hobby: Hobby)
    fun getHobbies(): Flow<List<Hobby>>
    suspend fun deleteHobby(hobby: Hobby)
}