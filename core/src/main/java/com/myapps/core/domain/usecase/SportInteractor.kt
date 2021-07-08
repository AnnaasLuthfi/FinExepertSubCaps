package com.myapps.core.domain.usecase

import com.myapps.core.domain.model.Sport
import com.myapps.core.domain.repository.ISportRepository

class SportInteractor (private val sportRepository: ISportRepository): SportUseCase{
    override fun getAllsport() = sportRepository.getAllsport()

    override fun getFavoritesport() = sportRepository.getFavoritesport()

    override fun setFavoritesport(sport: Sport, state: Boolean) = sportRepository.setFavoritesport(sport, state)
}