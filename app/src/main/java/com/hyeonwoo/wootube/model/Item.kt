package com.hyeonwoo.wootube.model


import java.io.Serializable

data class Item(
    val etag: String,
    val id: String,
    val kind: String,
    val snippet: Snippet
) : Serializable