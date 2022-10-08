package com.hyeonwoo.wootube.model


import com.google.gson.annotations.SerializedName

data class Item(
    val etag: String,
    val id: String,
    val kind: String,
    val snippet: Snippet
)