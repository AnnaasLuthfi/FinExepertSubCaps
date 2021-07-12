package com.myapps.core.domain.repository

import com.myapps.core.data.Resource
import com.myapps.core.domain.model.Sport
import kotlinx.coroutines.flow.Flow

interface ISportRepository {

    fun getAllSport(): Flow<Resource<List<Sport>>>

    fun getFavoriteSport(): Flow<List<Sport>>

    fun setFavoriteSport(sport: Sport, state: Boolean)

}