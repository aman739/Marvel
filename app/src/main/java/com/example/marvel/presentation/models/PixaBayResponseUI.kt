package com.example.marvel.presentation.models

import com.example.pixabay.domain.models.PixaBayResponse

data class PixaBayResponseUI(
    val id: Int?,
    val totalHist: Int?,
    val hits: List<PixaBayModelUI>,
)

fun PixaBayResponse.toUI() = PixaBayResponseUI(id, totalHist, hits.map { it.toUI() })

