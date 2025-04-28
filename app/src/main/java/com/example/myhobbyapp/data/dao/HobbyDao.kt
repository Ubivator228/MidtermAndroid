package com.example.myhobbyapp.data.dao

import androidx.room.*
import com.example.myhobbyapp.data.entities.HobbyEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HobbyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHobby(hobby: HobbyEntity)

    @Query("SELECT * FROM hobbies")
    fun getAllHobbies(): Flow<List<HobbyEntity>>

    @Delete
    suspend fun deleteHobby(hobby: HobbyEntity)
}