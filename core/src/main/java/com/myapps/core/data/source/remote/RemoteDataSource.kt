package com.myapps.core.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.myapps.core.data.source.remote.network.ApiResponse
import com.myapps.core.data.source.remote.network.ApiService
import com.myapps.core.data.source.remote.response.SportResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.lang.Exception

class RemoteDataSource(private val apiService: ApiService) {
    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

    }

    suspend fun getAllsport(): Flow<ApiResponse<List<SportResponse>>> {

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