package com.hyeonwoo.wootube.model


import com.google.gson.annotations.SerializedName

data class Video(
    val etag: String,
    val items: List<Item>,
    val kind: String,
    val nextPageToken: String,
    val pageInfo: PageInfo
)