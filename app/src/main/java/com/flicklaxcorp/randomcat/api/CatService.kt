package com.flicklaxcorp.randomcat.api

import com.flicklaxcorp.randomcat.api.dto.CatResponse
import retrofit2.http.GET

interface CatService {
    @GET("meow")
    suspend fun getRandomCatImage() : CatResponse
}