import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.shreyaskv.bluetoothdataexchangeapp.domain.chat.BluetoothDeviceDomain
import com.shreyaskv.bluetoothdataexchangeapp.domain.chat.BluetoothDevices

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain():BluetoothDevices{
    return BluetoothDeviceDomain(
        name=name,
        address=address
    )
}