package com.hyeonwoo.wootube.network

import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WooTubeService {
    @GET("videos")
    suspend fun fetchVideoList(
        @Query("part") part : String = "id",
        @Query("chart") chart : String = "mostPopular"
    ) : Single<okhttp3.Response>

}