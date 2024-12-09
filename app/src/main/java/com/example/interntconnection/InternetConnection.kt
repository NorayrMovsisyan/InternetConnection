package com.example.interntconnection

import kotlinx.coroutines.flow.Flow

interface InternetConnection {

    val isConnected: Flow<Boolean>
}