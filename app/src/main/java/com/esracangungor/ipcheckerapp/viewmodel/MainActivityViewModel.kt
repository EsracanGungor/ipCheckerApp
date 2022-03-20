package com.esracangungor.ipcheckerapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.esracangungor.ipcheckerapp.repository.MainActivityRepository

class MainActivityViewModel : ViewModel() {
    var servicesLiveData: MutableLiveData<String> = MainActivityRepository.getServicesApiCall()
}