package com.example.pixabay.domain.repositories

import com.example.pixabay.domain.either.Either
import com.example.pixabay.domain.models.PixaBayResponse
import kotlinx.coroutines.flow.Flow

interface PixabayRepository {
    fun fetchPixaBay(keyword: String): Flow<Either<String, PixaBayResponse>>
}