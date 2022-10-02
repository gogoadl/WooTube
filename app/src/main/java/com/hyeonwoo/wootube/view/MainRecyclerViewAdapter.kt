package com.hyeonwoo.wootube.view

import android.R
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hyeonwoo.wootube.model.Item
import kr.co.prnd.YouTubePlayerView


class MainRecyclerViewAdapter(val videoList: List<Item>) : RecyclerView.Adapter<>() {

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val youTubePlayerView: YouTubePlayerView
        init {
            // Define click listener for the ViewHolder's View.
            youTubePlayerView = itemView.findViewById(R.id.video_view)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
