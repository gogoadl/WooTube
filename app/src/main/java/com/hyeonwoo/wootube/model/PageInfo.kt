package com.hyeonwoo.wootube.model


import com.google.gson.annotations.SerializedName

data class PageInfo(
    val resultsPerPage: Int,
    val totalResults: Int
)