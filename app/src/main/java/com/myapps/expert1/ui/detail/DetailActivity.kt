package com.myapps.expert1.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.myapps.core.domain.model.Sport
import com.myapps.expert1.R
import com.myapps.expert1.databinding.ActivityDetailBinding
import org.koin.android.viewmodel.ext.android.viewModel

class DetailActivity : AppCompatActivity() {

    private val detailSportViewModel: DetailSportViewModel by viewModel()
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val detailsport = intent.getParcelableExtra<Sport>(EXTRA_DATA)
        viewDetail(detailsport)
    }

    private fun viewDetail(detailSport: Sport?) {
        detailSport?.let {

            Glide.with(this)
                .load(detailSport.strSportThumb)
                .into(binding.imageViewDetail)

            binding.title.text = detailSport.strSport
            binding.type.text = detailSport.strFormat
            binding.description.text = detailSport.strSportDescription
            var isFavorite = detailSport.isFavorite

            setStatusFavorite(isFavorite)

            binding.favorite.setOnClickListener {
                isFavorite = !isFavorite
                detailSportViewModel.setFavoritesport(detailSport, isFavorite)
                setStatusFavorite(isFavorite)
            }
        }
    }

    private fun setStatusFavorite(isFavorite: Boolean) {
        if (isFavorite) {
            binding.favorite.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_baseline_add_favorite))
        } else {
            binding.favorite.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_baseline_favorite_not_favorite))
        }

    }
}