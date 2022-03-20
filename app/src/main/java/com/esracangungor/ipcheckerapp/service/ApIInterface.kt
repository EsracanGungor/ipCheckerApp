package com.esracangungor.ipcheckerapp.service

import retrofit2.Response
import retrofit2.http.GET

interface ApIInterface {
    @GET(" ")
    suspend fun getData(): Response<String>
}