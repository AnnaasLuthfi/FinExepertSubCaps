package com.myapps.expert1.di

import com.myapps.core.domain.usecase.SportInteractor
import com.myapps.core.domain.usecase.SportUseCase
import com.myapps.expert1.ui.detail.DetailSportViewModel
import com.myapps.expert1.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


    val useCaseModule = module {
        factory<SportUseCase> { SportInteractor(get()) }
    }

    val viewModelModule = module {
        viewModel { HomeViewModel(get()) }
        viewModel { DetailSportViewModel(get()) }
    }

