package com.example.marvel.di

import com.example.PixaBay.data.repositories.PixaBayRepositoryImpl
import com.example.pixabay.domain.repositories.PixabayRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindToPixabayRepository(pixaBayRepositoryImpl: PixaBayRepositoryImpl): PixabayRepository
}