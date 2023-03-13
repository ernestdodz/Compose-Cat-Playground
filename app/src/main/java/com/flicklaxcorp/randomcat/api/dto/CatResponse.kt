package com.flicklaxcorp.randomcat.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatResponse(
    @Json(name = "file")
    val imageUrl: String,
)