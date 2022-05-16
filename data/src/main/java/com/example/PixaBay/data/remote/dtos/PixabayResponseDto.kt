package com.example.PixaBay.data.remote.dtos

import com.example.pixabay.domain.models.PixaBayResponse
import com.google.gson.annotations.SerializedName

data class PixabayResponseDto(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("totalHits")
    val totalHits: Int?,
    @SerializedName("hits")
    val hits: List<PixabayModelDto>
)

fun PixabayResponseDto.toDomain() = PixaBayResponse(id, totalHits, hits.map {
    it.toDomain()
})

