package com.hyeonwoo.wootube.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.hyeonwoo.wootube.model.Item
import com.hyeonwoo.wootube.model.Video
import com.hyeonwoo.wootube.network.WooTubeService
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
     private val WooTubeService: WooTubeService
    ) : ViewModel() {
    val videoList = WooTubeService.fetchVideoList()

    fun videoList() : Single<Video> {
        return videoList
            .subscribeOn(Schedulers.io()) // 네트워크 작업은 IO 쓰레드에서 수행
            .observeOn(AndroidSchedulers.mainThread()) // UI 업데이트 작업은 메인 쓰레드에서 수행
    }
}