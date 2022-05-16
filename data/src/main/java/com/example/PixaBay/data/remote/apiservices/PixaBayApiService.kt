package com.example.PixaBay.data.remote.apiservices

import com.example.PixaBay.data.remote.dtos.PixabayResponseDto
import retrofit2.http.GET

interface PixaBayApiService {
    @GET(API_KEY)
    suspend fun fetchPixaBay(): PixabayResponseDto

    companion object {
        const val API_KEY: String = "?key=25680573-99ab4b0392ec7236ffaa0c266"

    }
}