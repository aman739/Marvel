package com.example.marvel.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.presentation.extensions.setImage
import com.example.marvel.databinding.ItemAnimeBinding
import com.example.marvel.presentation.base.BaseDiffUtil
import com.example.marvel.presentation.models.PixaBayModelUI

class PixaBayAdapter :
    ListAdapter<PixaBayModelUI, PixaBayAdapter.PixaBayViewHolder>(BaseDiffUtil()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PixaBayAdapter.PixaBayViewHolder {
        return PixaBayViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PixaBayAdapter.PixaBayViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class PixaBayViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(data: PixaBayModelUI) {
            data.previewURL?.let { binding.imImage.setImage(it) }
            binding.tvName.text = data.user.toString()
            binding.tvCharac.text = data.tags.toString()
        }
    }
}