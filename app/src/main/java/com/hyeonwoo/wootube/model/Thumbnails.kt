package com.hyeonwoo.wootube.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Thumbnails(
    val default: Default,
    val high: High,
    val maxres: Maxres,
    val medium: Medium,
    val standard: Standard
): Parcelable