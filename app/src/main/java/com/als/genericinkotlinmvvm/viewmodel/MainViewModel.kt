package com.als.genericinkotlinmvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainViewModel(private val liveDataToObserve: MutableLiveData<String> = MutableLiveData()) :
    BaseViewModel() {

    fun getLiveData(): LiveData<String> = liveDataToObserve

    fun load() {
        liveDataToObserve.postValue("vdfkvmdfkv")
    }
}
