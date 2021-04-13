package com.example.recruitmenttest.api

import com.example.recruitmenttest.model.Info
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {
    @get:GET("dev/providers/1")
    val info: Call<List<Info?>?>?

}