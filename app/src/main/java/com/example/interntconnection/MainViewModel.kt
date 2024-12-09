package com.example.interntconnection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class MainViewModel(
    private val internetConnection: InternetConnection
) : ViewModel() {

    val isConnected = internetConnection.isConnected
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), false)
}