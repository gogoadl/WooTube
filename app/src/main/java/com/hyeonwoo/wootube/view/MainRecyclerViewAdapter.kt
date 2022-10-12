package com.hyeonwoo.wootube.view

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hyeonwoo.wootube.R
import com.hyeonwoo.wootube.model.Item
import com.skydoves.transformationlayout.TransformationCompat
import com.skydoves.transformationlayout.TransformationCompat.startActivity
import com.skydoves.transformationlayout.TransformationLayout
import kr.co.prnd.YouTubePlayerView


class MainRecyclerViewAdapter(private val context: Context, private val videoList: List<Item>) : RecyclerView.Adapter<MainRecyclerViewAdapter.MainViewHolder>() {

    inner class MainViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val transformationLayout : TransformationLayout
        val videoImage: ImageView
        val videoTitle: TextView
        val videoChannelTitle: TextView
        init {
            // Define click listener for the ViewHolder's View.
            videoImage = itemView.findViewById(R.id.video_image)
            videoTitle = itemView.findViewById(R.id.video_title)
            videoChannelTitle = itemView.findViewById(R.id.video_channel_title)
            transformationLayout = itemView.findViewById(R.id.transformationLayout)
            Log.d("findViewById", "findViewById video_view")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_main_recyclerview, parent, false)
        Log.d("onCreateViewHolder", "onCreateViewHolder")
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        Log.d("onBindViewHolder", "onBindViewHolder 1")
        Glide.with(context).load(videoList.get(position).snippet.thumbnails.maxres.url).into(holder.videoImage)
        holder.videoTitle.text = videoList.get(position).snippet.title
        holder.videoChannelTitle.text = videoList.get(position).snippet.channelTitle
        holder.transformationLayout.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            startActivity(holder.transformationLayout, intent)
        }
//        holder.youTubePlayerView.play(videoList.get(position).id, null)
        Log.d("onBindViewHolder", "onBindViewHolder 2")
    }

    override fun getItemCount(): Int {
        return videoList.size
    }
}
