package com.example.marvel.presentation.ui.fragment

import com.example.marvel.presentation.base.BaseViewModel
import com.example.marvel.presentation.models.PixaBayResponseUI
import com.example.marvel.presentation.models.toUI
import com.example.pixabay.domain.usecase.PixabayUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class PixabayViewModel @Inject constructor(private val useCase: PixabayUseCase) :
    BaseViewModel() {

    private val _pixabayState = mutableUIStateFlow<PixaBayResponseUI>()
    val pixabayState = _pixabayState.asStateFlow()

    init {
        fetchPixaBay("car")
    }

    fun fetchPixaBay(keyword: String) {
        useCase(keyword).collectRequest(_pixabayState) {
            it.toUI()
        }
    }
}


