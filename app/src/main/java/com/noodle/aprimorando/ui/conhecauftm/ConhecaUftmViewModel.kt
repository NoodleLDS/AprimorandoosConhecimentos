package com.noodle.aprimorando.ui.conhecauftm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ConhecaUftmViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Conheca a UFTM aqui"
    }
    val text: LiveData<String> = _text
}