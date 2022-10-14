package com.hyeonwoo.wootube.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Maxres(
    val height: Int,
    val url: String,
    val width: Int
): Parcelable