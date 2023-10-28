package com.shreyaskv.bluetoothdataexchangeapp.presentation

import android.bluetooth.BluetoothDevice
import com.shreyaskv.bluetoothdataexchangeapp.domain.chat.BluetoothDevices

data class BluetoothUiState(
    val scannedDevice: List<BluetoothDevices> = emptyList(),
    val pairedDevice: List<BluetoothDevices> = emptyList()
)
