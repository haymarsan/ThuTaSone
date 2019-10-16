package com.winhtetnaing.thutasone.data.networking

import com.winhtetnaing.thutasone.data.model.Blogspot
import retrofit2.Call
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {
    @POST("/feeds/posts/default")
    @FormUrlEncoded
    fun getBlospotList(@FieldMap params: Map<String, String>): Call<Blogspot>
}