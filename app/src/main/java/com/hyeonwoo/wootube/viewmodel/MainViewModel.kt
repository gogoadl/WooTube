package com.hyeonwoo.wootube.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.hyeonwoo.wootube.model.Video
import com.hyeonwoo.wootube.network.WooTubeService
import dagger.hilt.android.lifecycle.HiltViewModel
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
     private val WooTubeService: WooTubeService
    ) : ViewModel() {
    val videoList = WooTubeService.fetchVideoList()
    fun videoList() {
        videoList.enqueue(object : Callback<Video> {
            override fun onResponse(call: Call<Video>, response: Response<Video>) {

                Log.d("onResponse","videos : ${response.body()}")
            }

            override fun onFailure(call: Call<Video>, t: Throwable) {
                Log.d("onFailure","videos : $t")
            }

        })

    }
}