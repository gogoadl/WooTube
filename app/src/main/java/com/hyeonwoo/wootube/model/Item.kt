package com.hyeonwoo.wootube.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Item(
    val etag: String,
    val id: String,
    val kind: String,
    val snippet: Snippet
): Parcelable