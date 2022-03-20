package com.esracangungor.ipcheckerapp.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.esracangungor.ipcheckerapp.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


object MainActivityRepository {
    private val serviceSetterGetter = MutableLiveData<String>()

    fun getServicesApiCall(): MutableLiveData<String> {

        val call = RetrofitClient.apiInterface.getData()

        call.enqueue(object: Callback<String> {
            override fun onFailure(call: Call<String>, t: Throwable) {
                Log.v("DEBUG : ", t.message.toString())
            }

            override fun onResponse(
                call: Call<String>,
                response: Response<String>
            ) {
                Log.v("DEBUG : ", response.body().toString())
                val data = response.body()
                val msg = data.toString()
                serviceSetterGetter.value = msg
            }
        })

        return serviceSetterGetter
    }
}