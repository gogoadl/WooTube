package com.hyeonwoo.wootube.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Medium(
    val height: Int,
    val url: String,
    val width: Int
): Parcelable