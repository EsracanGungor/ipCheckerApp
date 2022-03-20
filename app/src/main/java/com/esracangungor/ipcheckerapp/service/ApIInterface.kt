package com.esracangungor.ipcheckerapp.service

import retrofit2.Call
import retrofit2.http.GET

interface ApIInterface {
    @GET(" ")
    fun getData():Call<String>
}