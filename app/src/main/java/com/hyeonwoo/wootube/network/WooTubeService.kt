package com.hyeonwoo.wootube.network

import com.hyeonwoo.wootube.BuildConfig
import com.hyeonwoo.wootube.model.Video
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WooTubeService {
    @GET("videos")
    fun fetchVideoList(
        @Query("part") part : String = "snippet",
        @Query("chart") chart : String = "mostPopular",
        @Query("key") key : String = BuildConfig.YOUTUBE_API_KEY
    ) : Single<Video>

}