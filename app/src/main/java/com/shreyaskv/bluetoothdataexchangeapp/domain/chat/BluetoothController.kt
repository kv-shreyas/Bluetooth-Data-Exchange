package com.shreyaskv.bluetoothdataexchangeapp.domain.chat

import kotlinx.coroutines.flow.StateFlow

interface BluetoothController {
    val scannedDevices: StateFlow<List<BluetoothDevices>>
    val pairedDevices: StateFlow<List<BluetoothDevices>>

    fun startDiscovery()

    fun stopDiscovery()

    fun release()

}