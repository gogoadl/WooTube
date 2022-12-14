package com.hyeonwoo.wootube.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hyeonwoo.wootube.model.Item
import com.hyeonwoo.wootube.network.WooTubeService
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
     private val WooTubeService: WooTubeService
    ) : ViewModel() {
    val videoList = MutableLiveData<List<Item>>()

    fun getVideoList() {
        WooTubeService.fetchVideoList()
            .subscribeOn(Schedulers.io()) // 네트워크 작업은 IO 쓰레드에서 수행
            .observeOn(AndroidSchedulers.mainThread()) // UI 업데이트 작업은 메인 쓰레드에서 수행
            .subscribe(
                {
                    videoList.value = it.items
                    Log.d("TAG", "${it.items}")
                },
                {
                    videoList.value = emptyList()
                }
            )
    }
}