package com.hyeonwoo.wootube.viewmodel

import androidx.lifecycle.ViewModel
import com.hyeonwoo.wootube.network.WooTubeService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
     private val WooTubeService: WooTubeService
    ) : ViewModel() {
    val a = WooTubeService.fetchVideoList()
}