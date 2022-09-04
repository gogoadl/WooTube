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
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): WooTubeService {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(
                "https://www.googleapis.com/youtube/v3/")
            .build()
            .create(WooTubeService::class.java)
    }
}