package com.esracangungor.ipcheckerapp.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.esracangungor.ipcheckerapp.retrofit.RetrofitClient
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers


object MainActivityRepository {
    private val serviceSetterGetter = MutableLiveData<String>()
    private val disposable = CompositeDisposable()

    fun getServicesApiCall(): MutableLiveData<String> {
        disposable.add(
            RetrofitClient.apiInterface.getData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<String>(){
                    override fun onSuccess(t: String) {
                        serviceSetterGetter.value =t
                    }
                    override fun onError(e: Throwable) {
                        Log.v("DEBUG : ", e.message.toString())
                    }
                })
        )
        return serviceSetterGetter
    }
}