package com.myapps.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.myapps.core.domain.usecase.SportUseCase

class FavoriteViewModel(sportUseCase: SportUseCase) : ViewModel() {

    val favoritesport = sportUseCase.getFavoritesport().asLiveData()

}