package com.myapps.core.domain.usecase

import com.myapps.core.data.Resource
import com.myapps.core.domain.model.Sport
import kotlinx.coroutines.flow.Flow

interface SportUseCase {
    fun getAllSport(): Flow<Resource<List<Sport>>>
    fun getFavoriteSport(): Flow<List<Sport>>
    fun setFavoriteSport(sport: Sport, state: Boolean)
}