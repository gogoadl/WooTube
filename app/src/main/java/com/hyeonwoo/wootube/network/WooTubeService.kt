package com.hyeonwoo.wootube.network

import io.reactivex.rxjava3.core.Single
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WooTubeService {
    @GET("videos")
    fun fetchVideoList(
        @Query("part") part : String = "id",
        @Query("chart") chart : String = "mostPopular",
        @Query("key") key : String = "AIzaSyBWmH6sgU_IRvIcV-SqcQpXA6m3KCoYfd4"
    ) : Call<String>

}