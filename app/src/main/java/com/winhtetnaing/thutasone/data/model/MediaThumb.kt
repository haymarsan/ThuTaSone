package com.winhtetnaing.thutasone.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MediaThumb(
    @SerializedName("xmlns\$media") val xmls: String,
    @SerializedName("url") val url: String,
    @SerializedName("height") val height: String,
    @SerializedName("width") val width: String
) : Serializable