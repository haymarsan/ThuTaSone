package com.winhtetnaing.thutasone.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Videos(
    @SerializedName("id") val id: String = "",
    @SerializedName("name") val name: String = "",
    @SerializedName("thumbnail") val thumbnail: String = "",
    @SerializedName("url") val url: String = "",
    @SerializedName("desc") val desc: String = ""
) : Serializable