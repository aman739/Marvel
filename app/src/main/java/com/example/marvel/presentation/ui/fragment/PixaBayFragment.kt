package com.example.marvel.presentation.ui.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.marvel.R
import com.example.marvel.databinding.FragmentAnimeBinding
import com.example.marvel.presentation.base.BaseFragment
import com.example.marvel.presentation.ui.adapter.PixaBayAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PixaBayFragment : BaseFragment<PixabayViewModel, FragmentAnimeBinding>(
    R.layout.fragment_anime
) {
    override val viewModel: PixabayViewModel by viewModels()
    override val binding by viewBinding(FragmentAnimeBinding::bind)
    private val pixabayAdapter = PixaBayAdapter()

    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerView.adapter = pixabayAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
    }



    override fun setupSubscribe() {
        viewModel.pixabayState.collectUIState(
            error = {
                Log.e("bankai", it)
            },
            success = {
                Log.e("akashi", "Success ${it.hits}")
                pixabayAdapter.submitList(it.hits)
            })
    }
}
