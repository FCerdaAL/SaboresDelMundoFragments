package com.raywenderlich.saboresdelmundofragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel(){

    private var _comida = MutableLiveData<String>("")
    val comida : LiveData<String> = _comida

    private var _pais = MutableLiveData<String>("")
    val pais : LiveData<String> = _pais

    fun saveComida( newComida : String){
        _comida.value = newComida

    }fun savePais( newPais : String){
        _pais.value = newPais
    }
}