package com.myapps.expert1.ui.detail

import androidx.lifecycle.ViewModel
import com.myapps.core.domain.model.Sport
import com.myapps.core.domain.usecase.SportUseCase

class DetailSportViewModel(private val sportUseCase: SportUseCase) : ViewModel() {
    fun setFavoriteSport(sport: Sport, newStatus:Boolean) = sportUseCase.setFavoriteSport(sport, newStatus)
}