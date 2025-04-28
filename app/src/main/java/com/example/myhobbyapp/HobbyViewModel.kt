package com.example.myhobbyapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myhobbyapp.domain.model.Hobby
import com.example.myhobbyapp.domain.usecase.AddHobbyUseCase
import com.example.myhobbyapp.domain.usecase.GetHobbiesUseCase
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class HobbyViewModel(
    private val addHobbyUseCase: AddHobbyUseCase,
    private val getHobbiesUseCase: GetHobbiesUseCase
) : ViewModel() {

    val hobbies: StateFlow<List<Hobby>> = getHobbiesUseCase()
        .stateIn(viewModelScope, SharingStarted.Lazily, emptyList())

    fun addHobby(hobby: Hobby) {
        viewModelScope.launch {
            addHobbyUseCase(hobby)
        }
    }
}