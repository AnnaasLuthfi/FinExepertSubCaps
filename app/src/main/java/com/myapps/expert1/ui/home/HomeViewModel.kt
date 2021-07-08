package com.myapps.expert1.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.myapps.core.domain.usecase.SportUseCase

class HomeViewModel(sportUseCase: SportUseCase) : ViewModel() {

    val sport = sportUseCase.getAllsport().asLiveData()

}