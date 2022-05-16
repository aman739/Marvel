package com.example.marvel.di

import com.example.PixaBay.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    private val retrofit = RetrofitClient()

    @Singleton
    @Provides
    fun providePixaBayApiService() = retrofit.providePixaBayApiService()
}