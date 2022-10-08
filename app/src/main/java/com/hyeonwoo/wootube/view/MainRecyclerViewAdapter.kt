package com.hyeonwoo.wootube.view

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hyeonwoo.wootube.R
import com.hyeonwoo.wootube.model.Item
import kr.co.prnd.YouTubePlayerView


class MainRecyclerViewAdapter(val videoList: List<Item>) : RecyclerView.Adapter<MainRecyclerViewAdapter.MainViewHolder>() {

    inner class MainViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val youTubePlayerView: YouTubePlayerView
        init {
            // Define click listener for the ViewHolder's View.
            youTubePlayerView = itemView.findViewById(R.id.video_view)
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
//        holder.youTubePlayerView.play(videoList.get(position).id, null)
        Log.d("onBindViewHolder", "onBindViewHolder 2")
    }

    override fun getItemCount(): Int {
        return videoList.size
    }
}
