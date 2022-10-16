package com.hyeonwoo.wootube.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.annotation.VisibleForTesting
import com.hyeonwoo.wootube.R
import com.hyeonwoo.wootube.model.Item
import com.skydoves.bundler.bundleNonNull
import com.skydoves.bundler.intentOf
import com.skydoves.transformationlayout.TransformationAppCompatActivity
import com.skydoves.transformationlayout.TransformationCompat
import com.skydoves.transformationlayout.TransformationCompat.onTransformationEndContainerApplyParams
import com.skydoves.transformationlayout.TransformationCompat.onTransformationStartContainer
import com.skydoves.transformationlayout.TransformationLayout
import com.skydoves.transformationlayout.onTransformationStartContainer

class DetailActivity : TransformationAppCompatActivity() {

    private val videoItem: Item by bundleNonNull(EXTRA_ITEM)

    override fun onCreate(savedInstanceState: Bundle?) {
        onTransformationStartContainer()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        Log.d("TAG", "$videoItem")
    }

    companion object {
        @VisibleForTesting
        internal const val EXTRA_ITEM = "EXTRA_ITEM"

        fun startActivity(transformationLayout: TransformationLayout, item: Item) =
            transformationLayout.context.intentOf<DetailActivity> {
                putExtra(EXTRA_ITEM to item)
                TransformationCompat.startActivity(transformationLayout, intent)
            }
    }
}