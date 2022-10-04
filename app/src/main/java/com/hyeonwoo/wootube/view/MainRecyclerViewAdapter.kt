package com.hyeonwoo.wootube.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hyeonwoo.wootube.R
import com.hyeonwoo.wootube.model.Item
import kr.co.prnd.YouTubePlayerView


class MainRecyclerViewAdapter(val videoList: List<Item>) : RecyclerView.Adapter<MainRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val youTubePlayerView: YouTubePlayerView
        init {
            // Define click listener for the ViewHolder's View.
            youTubePlayerView = itemView.findViewById(R.id.video_view)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_main_recyclerview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.youTubePlayerView.play(videoList.get(position).id, null)
    }

    override fun getItemCount(): Int {
        return videoList.size
    }
}
