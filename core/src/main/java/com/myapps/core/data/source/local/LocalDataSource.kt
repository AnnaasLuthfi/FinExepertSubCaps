package com.myapps.core.data.source.local

import com.myapps.core.data.source.local.entity.SportEntity
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val sportDao: SportDao){


    fun getAllSport(): Flow<List<SportEntity>> = sportDao.getAllSports()

    fun getFavoriteSport(): Flow<List<SportEntity>> = sportDao.getFavoriteSports()

    suspend fun insertSport(sportList: List<SportEntity>) = sportDao.insertSports(sportList)

    fun setFavoriteSport(sport: SportEntity, newState: Boolean) {
        sport.isFavorite = newState
        sportDao.updateFavoriteSports(sport)
    }

}