package com.myapps.expert1.ui.detail

import androidx.lifecycle.ViewModel
import com.myapps.core.domain.model.Sport
import com.myapps.core.domain.usecase.SportUseCase

class DetailSportViewModel(private val sportUseCase: SportUseCase) : ViewModel() {
    fun setFavoritesport(sport: Sport, newStatus:Boolean) = sportUseCase.setFavoritesport(sport, newStatus)
}