package juliano.correa.mineproject

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonCalculator : Button
    private lateinit var buttonSounds : Button
    private lateinit var buttonPlay : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initizalizer()

        buttonCalculator.setOnClickListener {
            val intent2 = Intent (this@MainActivity, Screen2::class.java)
            startActivity(intent2)
        }

        buttonSounds.setOnClickListener {
            val intent = Intent (this@MainActivity, Screen1::class.java)
            startActivity(intent)
        }

        buttonPlay.setOnClickListener {
            vibrate()
        }

    }

    private fun initizalizer() {
        buttonCalculator = findViewById(R.id.buttonCalculator)
        buttonSounds = findViewById(R.id.buttonSounds)
        buttonPlay = findViewById(R.id.buttonPlay)
    }

    private fun vibrate() {
        val pattern = longArrayOf(0, 200, 100, 300)
        val hardware = this@MainActivity.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        hardware?.let {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                hardware.vibrate(VibrationEffect.createWaveform(pattern, -1))
            } else {
                hardware.vibrate(pattern, -1)
            }
        }
    }
}