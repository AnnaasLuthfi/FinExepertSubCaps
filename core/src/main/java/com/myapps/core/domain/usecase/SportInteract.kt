package com.myapps.core.domain.usecase

import com.myapps.core.domain.model.Sport
import com.myapps.core.domain.repository.ISportRepository

class SportInteract (private val sportRepository: ISportRepository): SportUseCase{
    override fun getAllSport() = sportRepository.getAllSport()

    override fun getFavoriteSport() = sportRepository.getFavoriteSport()

    override fun setFavoriteSport(sport: Sport, state: Boolean) = sportRepository.setFavoriteSport(sport, state)
}