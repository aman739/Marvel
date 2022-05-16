package com.example.PixaBay.data.repositories

import com.example.PixaBay.data.remote.dtos.toDomain
import com.example.PixaBay.data.remote.apiservices.PixaBayApiService
import com.example.PixaBay.data.repositories.base.BaseRepository
import com.example.pixabay.domain.repositories.PixabayRepository
import javax.inject.Inject

class PixaBayRepositoryImpl @Inject constructor(
    private val service: PixaBayApiService
) : BaseRepository(), PixabayRepository {

    override fun fetchPixaBay(keyword: String) = doRequest {
        service.fetchPixaBay().toDomain()
    }
}
