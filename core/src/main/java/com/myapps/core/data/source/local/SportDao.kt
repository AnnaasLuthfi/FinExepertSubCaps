package com.myapps.core.data.source.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.myapps.core.data.source.local.entity.SportEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SportDao {

    @Query("SELECT * FROM sport")
    fun getAllsports(): Flow<List<SportEntity>>

    @Query("SELECT * FROM sport where isFavorite = 1")
    fun getFavoritesports(): Flow<List<SportEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertsports(sport: List<SportEntity>)

    @Update
    fun updateFavoritesports(sport: SportEntity)

}