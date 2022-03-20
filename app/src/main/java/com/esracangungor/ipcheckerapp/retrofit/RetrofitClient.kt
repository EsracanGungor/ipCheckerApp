package com.esracangungor.ipcheckerapp.retrofit

import com.esracangungor.ipcheckerapp.service.ApIInterface
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "http://checkip.amazonaws.com/"
    private val retrofitClient: Retrofit.Builder by lazy {

        val gson = GsonBuilder()
            .setLenient()
            .create()

        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
    }

    val apiInterface: ApIInterface by lazy {
        retrofitClient
            .build()
            .create(ApIInterface::class.java)
    }
}