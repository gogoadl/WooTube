package com.hyeonwoo.wootube.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PageInfo(
    val resultsPerPage: Int,
    val totalResults: Int
): Parcelable