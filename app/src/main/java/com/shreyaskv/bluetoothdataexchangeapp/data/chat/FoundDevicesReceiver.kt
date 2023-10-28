package com.shreyaskv.bluetoothdataexchangeapp.data.chat

import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build

class FoundDevicesReceiver(private val onDeviceFound: (BluetoothDevice)->Unit): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        when(intent?.action){
            BluetoothDevice.ACTION_FOUND ->{
                val devices = if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.TIRAMISU){
                    intent.getParcelableArrayExtra(
                        BluetoothDevice.EXTRA_DEVICE,
                        BluetoothDevice::class.java
                    )
                }else{
                    intent.getParcelableArrayExtra(BluetoothDevice.EXTRA_DEVICE)
                }
                intent.let { onDeviceFound }
            }
        }
    }


}