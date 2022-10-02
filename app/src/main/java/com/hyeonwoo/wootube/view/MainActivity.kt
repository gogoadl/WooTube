package com.hyeonwoo.wootube.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
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
//    @Inject lateinit var wooTubeService : WooTubeService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.videoList()

        val youTubePlayerView = findViewById<YouTubePlayerView>(R.id.youtubePlayer)
        youTubePlayerView.play("yB1lWmEE0w0", object : YouTubePlayerView.OnInitializedListener {
            override fun onInitializationFailure(
                provider: YouTubePlayer.Provider,
                result: YouTubeInitializationResult
            ) {

            }

            override fun onInitializationSuccess(
                provider: YouTubePlayer.Provider,
                player: YouTubePlayer,
                wasRestored: Boolean
            ) {

            }

        })
    }
}