package com.example.myhobbyapp.domain.usecase


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myhobbyapp.HobbyViewModel
import com.example.myhobbyapp.domain.usecase.AddHobbyUseCase
import com.example.myhobbyapp.domain.usecase.GetHobbiesUseCase

class HobbyViewModelFactory(
    private val addHobbyUseCase: AddHobbyUseCase,
    private val getHobbiesUseCase: GetHobbiesUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HobbyViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return HobbyViewModel(addHobbyUseCase, getHobbiesUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
