package com.example.marvel.presentation.models

import com.example.marvel.presentation.base.BaseDiffUtilModel
import com.example.pixabay.domain.models.PixaBayModel

data class PixaBayModelUI(

    override val id: Int,
    val pageURL: String?,
    val type: String?,
    val tags: String?,
    val previewURL: String?,
    val previewWidth: Int?,
    val previewHeight: Int?,
    val webformatURL: String?,
    val webformatWidth: Int?,
    val webformatHeight: Int?,
    val largeImageURL: String?,
    val imageWidth: Int?,
    val imageHeight: Int?,
    val imageSize: Int?,
    val views: Int?,
    val downloads: Int?,
    val collections: Int?,
    val likes: Int?,
    val comments: Int?,
    val userId: Int?,
    val user: String?,
    val userImageURL: String?
) : BaseDiffUtilModel

fun PixaBayModel.toUI() = PixaBayModelUI(
    id,
    pageURL,
    type,
    tags,
    previewURL,
    previewWidth,
    previewHeight,
    webformatURL,
    webformatWidth,
    webformatHeight,
    largeImageURL,
    imageWidth,
    imageHeight,
    imageSize,
    views,
    downloads,
    collections,
    likes,
    comments,
    userId,
    user,
    userImageURL
)
