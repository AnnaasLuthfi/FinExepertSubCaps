package com.myapps.core.data.source.remote.network

import com.myapps.core.data.source.remote.response.ListSportResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("all_sports.php")
    suspend fun getList(): ListSportResponse
}