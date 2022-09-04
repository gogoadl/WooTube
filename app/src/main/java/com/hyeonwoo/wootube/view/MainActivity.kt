package com.hyeonwoo.wootube.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.hyeonwoo.wootube.R
import com.hyeonwoo.wootube.network.WooTubeService
import com.hyeonwoo.wootube.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val viewModel : MainViewModel by viewModels()
//    @Inject lateinit var wooTubeService : WooTubeService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.videoList()


    }
}