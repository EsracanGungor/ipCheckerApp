package com.esracangungor.ipcheckerapp.repository

import androidx.lifecycle.MutableLiveData
import com.esracangungor.ipcheckerapp.retrofit.RetrofitClient
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn


object MainActivityRepository {
    private val serviceSetterGetter = MutableLiveData<String>()

    suspend fun getServicesApiCall(): Flow<MutableLiveData<String>> {
        return flow {
            val response =  RetrofitClient.apiInterface.getData()
            withContext(Dispatchers.Main){
                if(response.isSuccessful) {
                    response.body()?.let {
                        val data = response.body()
                        serviceSetterGetter.value = data.toString()
                    }
                }
            }
            emit(serviceSetterGetter)
        }.flowOn(Dispatchers.IO)
    }
}