package com.myapps.core.domain.usecase

import androidx.lifecycle.LiveData
import com.myapps.core.data.Resource
import com.myapps.core.domain.model.Sport
import kotlinx.coroutines.flow.Flow

interface SportUseCase {
    fun getAllsport(): Flow<Resource<List<Sport>>>
    fun getFavoritesport(): Flow<List<Sport>>
    fun setFavoritesport(sport: Sport, state: Boolean)
}