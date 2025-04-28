package com.example.myhobbyapp.data.local

// data/local/AppDatabase.kt
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myhobbyapp.data.dao.HobbyDao
import com.example.myhobbyapp.data.entities.HobbyEntity

@Database(entities = [HobbyEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun hobbyDao(): HobbyDao
}