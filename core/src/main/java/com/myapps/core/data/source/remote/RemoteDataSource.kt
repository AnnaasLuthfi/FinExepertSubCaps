package com.myapps.core.data.source.remote

import com.myapps.core.data.source.remote.network.ApiResponse
import com.myapps.core.data.source.remote.network.ApiService
import com.myapps.core.data.source.remote.response.SportResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(private val apiService: ApiService) {
    suspend fun getAllSport(): Flow<ApiResponse<List<SportResponse>>> {

        return flow {
            try {
                val response = apiService.getList()
                val dataArray = response.sports
                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(response.sports))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e : Exception) {
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)

    }
}