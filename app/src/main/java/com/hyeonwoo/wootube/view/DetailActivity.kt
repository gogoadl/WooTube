package com.hyeonwoo.wootube.view

import android.os.Bundle
import com.hyeonwoo.wootube.R
import com.skydoves.transformationlayout.TransformationAppCompatActivity
import com.skydoves.transformationlayout.onTransformationStartContainer

class DetailActivity : TransformationAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        onTransformationStartContainer()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

}