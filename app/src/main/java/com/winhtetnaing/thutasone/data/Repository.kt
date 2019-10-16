package com.winhtetnaing.thutasone.data

import androidx.lifecycle.MutableLiveData
import com.winhtetnaing.thutasone.data.model.Blogspot
import com.winhtetnaing.thutasone.data.networking.Api
import com.winhtetnaing.thutasone.data.networking.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    lateinit var api: Api

    init {
        api = RetrofitService().createService(Api::class.java)
    }

    fun getBlogSpotArticles(params: Map<String, String>): MutableLiveData<Blogspot> {
        var blogArticles = MutableLiveData<Blogspot>()
        api.getBlospotList(params).enqueue(object : Callback<Blogspot> {
            override fun onFailure(call: Call<Blogspot>, t: Throwable) {
                blogArticles.value=null
            }

            override fun onResponse(call: Call<Blogspot>, response: Response<Blogspot>) {
                if (response.isSuccessful){
                    blogArticles.value=response.body()
                }
            }

        })
        return blogArticles
    }
}