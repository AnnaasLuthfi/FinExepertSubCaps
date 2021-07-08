package com.myapps.core.data.source.local

import androidx.lifecycle.LiveData
import com.myapps.core.data.source.local.entity.SportEntity
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val sportDao: SportDao){

    companion object {
        private var instance: LocalDataSource? = null

    }

    fun getAllsport(): Flow<List<SportEntity>> = sportDao.getAllsports()

    fun getFavoritesport(): Flow<List<SportEntity>> = sportDao.getFavoritesports()

    suspend fun insertsport(sportList: List<SportEntity>) = sportDao.insertsports(sportList)

    fun setFavoritesport(sport: SportEntity, newState: Boolean) {
        sport.isFavorite = newState
        sportDao.updateFavoritesports(sport)
    }

}