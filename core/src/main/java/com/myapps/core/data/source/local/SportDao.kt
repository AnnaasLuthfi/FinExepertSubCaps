package com.myapps.core.data.source.local

import androidx.room.*
import com.myapps.core.data.source.local.entity.SportEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SportDao {

    @Query("SELECT * FROM sport")
    fun getAllSports(): Flow<List<SportEntity>>

    @Query("SELECT * FROM sport where isFavorite = 1")
    fun getFavoriteSports(): Flow<List<SportEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSports(sport: List<SportEntity>)

    @Update
    fun updateFavoriteSports(sport: SportEntity)

}