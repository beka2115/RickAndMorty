package com.example.rickandmortytest.presentation.ui.episode

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortytest.data.model.EpisodeEntity
import com.example.rickandmortytest.databinding.ItemEpisodeBinding
import com.example.rickandmortytest.domain.model.Episode

class EpisodesAdapter(val onClick: (id: Int) -> Unit) :
    PagingDataAdapter<Episode, EpisodesAdapter.EpisodesViewHolder>(EpisodesDiffUtil()) {


    override fun onBindViewHolder(holder: EpisodesViewHolder, position: Int) {
        getItem(position)?.let { holder.bind(it) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodesViewHolder {
        return EpisodesViewHolder(
            ItemEpisodeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    inner class EpisodesViewHolder(private val binding: ItemEpisodeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Episode) {
            with(binding) {
                itemView.setOnClickListener {
                    onClick(data.id)
                }
                tvEpisode.text = data.episode
                tvName.text = data.name
                tvAirDate.text = data.air_date
            }
        }
    }

    private class EpisodesDiffUtil : DiffUtil.ItemCallback<Episode>() {

        override fun areItemsTheSame(oldItem: Episode, newItem: Episode) = oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Episode, newItem: Episode) = oldItem == newItem

    }

}