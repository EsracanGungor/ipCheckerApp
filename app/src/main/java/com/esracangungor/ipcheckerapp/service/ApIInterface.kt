package com.esracangungor.ipcheckerapp.service

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ApIInterface {
    @GET(" ")
    fun getData(): Single<String>
}