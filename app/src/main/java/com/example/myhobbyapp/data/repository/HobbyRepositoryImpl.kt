package com.example.myhobbyapp.data.repository


import android.R.attr.description
import android.R.attr.id
import android.R.attr.name
import com.example.myhobbyapp.data.dao.HobbyDao
import com.example.myhobbyapp.data.entities.HobbyEntity
import com.example.myhobbyapp.domain.model.Hobby
import com.example.myhobbyapp.domain.repository.HobbyRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class HobbyRepositoryImpl(private val dao: HobbyDao) : HobbyRepository {

    override suspend fun addHobby(hobby: Hobby) {
        dao.insertHobby(hobby.toEntity())
    }

    override fun getHobbies(): Flow<List<Hobby>> {
        return dao.getAllHobbies().map { list ->
            list.map { it.toDomain() }
        }
    }

    override suspend fun deleteHobby(hobby: Hobby) {
        dao.deleteHobby(hobby.toEntity())
    }
}

private fun HobbyEntity.toDomain() = Hobby(id, name, description)

private fun Hobby.toEntity() = HobbyEntity(id, name, description)