package juliano.correa.mineproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Screen2 : AppCompatActivity() {

    private lateinit var textNumberLevel : EditText
    private lateinit var textNumberMobs : EditText
    private lateinit var buttonCalculate : Button
    private lateinit var textViewPowerLevel : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

//        refs

        textNumberLevel = findViewById(R.id.editTextNumberLevel)
        textNumberMobs = findViewById(R.id.editTextNumberMobs)
        buttonCalculate = findViewById(R.id.buttonCalculate)
        textViewPowerLevel = findViewById(R.id.textViewPowerLevel)

        buttonCalculate.setOnClickListener {
            var level = textNumberLevel.text.toString().toInt()
            var mobs = textNumberMobs.text.toString().toInt()

            val result = level * mobs

            val response = "${getText(R.string.your_power_is)} $result"

            textViewPowerLevel.text = response

            clean()

        }

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun clean() {
        textNumberLevel.text.clear()
        textNumberMobs.text.clear()
    }
}