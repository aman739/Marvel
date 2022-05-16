package com.example.pixabay.domain.usecase

import com.example.pixabay.domain.repositories.PixabayRepository
import javax.inject.Inject

class PixabayUseCase @Inject constructor(private val repositories: PixabayRepository) {
    operator fun invoke(keyword: String) = repositories.fetchPixaBay(keyword)
}