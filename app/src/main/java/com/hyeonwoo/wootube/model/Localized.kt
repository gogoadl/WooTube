package com.hyeonwoo.wootube.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Localized(
    val description: String,
    val title: String
): Parcelable