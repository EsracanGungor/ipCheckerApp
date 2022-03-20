package com.esracangungor.ipcheckerapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.esracangungor.ipcheckerapp.repository.MainActivityRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    var servicesLiveData = MutableLiveData<String>()

    init {
        getApi()
    }

    private fun getApi() {
        viewModelScope.launch {
            MainActivityRepository.getServicesApiCall().collect {
                servicesLiveData.value = it.value
            }
        }

    }
}