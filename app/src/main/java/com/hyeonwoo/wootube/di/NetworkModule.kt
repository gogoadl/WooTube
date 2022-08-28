package com.hyeonwoo.wootube.di

import com.hyeonwoo.wootube.network.WooTubeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://www.googleapis.com/youtube/v3/")
            .build()
    }
    @Provides
    @Singleton
    fun provideWooTubeService(retrofit: Retrofit): WooTubeService {
        return retrofit.create(WooTubeService::class.java)
    }
}