package com.example.frd.api

import com.example.frd.models.*
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    // Converter
    //@Headers("Accept: application/json")
    @GET("/convert")
    suspend fun getConverter(@Query("from") from: String, @Query("to") to: String, @Query("amount") amount: String, @Query("api_key") api_key: String): Response<Converter?>

}

//?from=EUR&to=USD&amount={amount}&api_key=7a853e4068-48d2570065-rgaxkh