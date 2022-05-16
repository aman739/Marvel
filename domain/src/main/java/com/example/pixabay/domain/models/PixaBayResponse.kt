package com.example.pixabay.domain.models

data class PixaBayResponse (
    val id: Int?,
    val totalHist: Int?,
    val hits: List<PixaBayModel>,
)