package com.example.recruitmenttest.api

import okhttp3.Interceptor
import okhttp3.Response

class MyInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder().addHeader("Authorization", "Basic cJmAc71jah17sgqi1jqaksvaksda=").build()
        return chain.proceed(request)
    }
}