package com.winhtetnaing.thutasone.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Value(
    @SerializedName("\$t") val value: String
) : Serializable