package jp.lgs.wifionoff36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.wifi.WifiManager
import android.widget.Button
import android.widget.Toast
//import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wifiManager : WifiManager = getApplicationContext().getSystemService(WIFI_SERVICE)as WifiManager

        val toastButton: Button = findViewById(R.id.button)

        toastButton.setOnClickListener {

            if (wifiManager.isWifiEnabled) {
                textView.setText("WIFI OFF")
                Toast.makeText(this, "wifiオフ", Toast.LENGTH_SHORT).show()
                //wifiManager.isWifiEnabled = false;
            } else {
                textView.setText("WIFI ON")
                Toast.makeText(this, "wifiオン", Toast.LENGTH_SHORT).show()
                //wifiManager.isWifiEnabled = true;
            }
        }
    }
}
