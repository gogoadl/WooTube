package com.hyeonwoo.wootube.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.hyeonwoo.wootube.R
import com.hyeonwoo.wootube.network.WooTubeService
import com.hyeonwoo.wootube.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kr.co.prnd.YouTubePlayerView
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    val viewModel : MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.video_recycler_view)
        viewModel.getVideoList()
        viewModel.videoList.observe(this) {
            val mainRecyclerViewAdapter =
                viewModel.videoList.value?.let { MainRecyclerViewAdapter(it) }
            recyclerView.adapter = mainRecyclerViewAdapter
        }
    }
}