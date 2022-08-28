package com.hyeonwoo.wootube.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hyeonwoo.wootube.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}