package com.hyeonwoo.wootube.repository

import androidx.annotation.WorkerThread

interface MainRepository {
    @WorkerThread
    fun fetchWooTubeList(
        page: Int
    )
}