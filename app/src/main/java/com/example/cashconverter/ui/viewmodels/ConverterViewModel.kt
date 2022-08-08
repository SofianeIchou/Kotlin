package com.example.cashconverter.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.frd.api.ApiClient
import com.example.frd.models.Converter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ConverterViewModel: ViewModel() {
    fun getConverter(value: String): LiveData<Converter> {
        val converter = MutableLiveData<Converter>()
        CoroutineScope(Dispatchers.IO).launch {
            val res = ApiClient.apiService.getConverter("EUR", "USD", value, "7a853e4068-48d2570065-rgaxkh")
            converter.postValue(res.body()!!)
        }
        return converter
    }
}