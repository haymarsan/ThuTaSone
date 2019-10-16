package com.winhtetnaing.thutasone.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Category(
    @SerializedName("term") val term: String
) : Serializable