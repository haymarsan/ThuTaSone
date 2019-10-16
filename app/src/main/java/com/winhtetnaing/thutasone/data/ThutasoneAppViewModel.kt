package com.winhtetnaing.thutasone.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.winhtetnaing.thutasone.data.model.Blogspot

class ThutasoneAppViewModel(application: Application) :AndroidViewModel(application){
    private lateinit var mutableLiveData: MutableLiveData<Blogspot>

    fun getBlogArticles(params: Map<String, String>): LiveData<Blogspot> {
        mutableLiveData = Repository().getBlogSpotArticles(params)
        return mutableLiveData
    }
}