package com.bci.mvvmkotlinroom.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bci.mvvmkotlinroom.model.LoginTableModel
import com.bci.mvvmkotlinroom.repository.LoginRepository

class LoginViewModel:ViewModel() {
    var liveDataLogin: LiveData<LoginTableModel>? = null

    fun insertData(context: Context, username: String, password: String) {
        LoginRepository.insertData(context, username, password)
    }

    fun getLoginDetails(context: Context, username: String) : LiveData<LoginTableModel>? {
        liveDataLogin = LoginRepository.getLoginDetails(context, username)
        return liveDataLogin
    }
}