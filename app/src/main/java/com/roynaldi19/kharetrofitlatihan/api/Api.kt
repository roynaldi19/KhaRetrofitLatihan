package com.roynaldi19.kharetrofitlatihan.api

import com.roynaldi19.kharetrofitlatihan.model.UsersResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("users")
    fun getUsers(): Call<UsersResponse>

}