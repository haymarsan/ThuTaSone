package com.winhtetnaing.thutasone.data.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    val retrofit = Retrofit.Builder()
       .baseUrl("https://thutasonenews.blogspot.com")
        // .baseUrl("http://natureenergycare.blogspot.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <S> createService(serviceClass: Class<S>): S {
        return retrofit.create(serviceClass)
    }
}