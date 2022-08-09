package juliano.correa.first_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var buttonCalculator : Button
    private lateinit var buttonAbout : Button
    private lateinit var buttonRandom : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonCalculator.setOnClickListener {
            val intent = Intent (this@MainActivity, CalculatorScreen::class.java)
            startActivity(intent)
        }

        buttonRandom.setOnClickListener {
            val intent = Intent (this@MainActivity, RandomScreen::class.java)
            startActivity(intent)
        }

        buttonAbout.setOnClickListener {
            val intent = Intent (this@MainActivity, AboutScreen::class.java)
            startActivity(intent)
        }
    }

    private fun initializer() {
        buttonCalculator = findViewById(R.id.buttonCalculator)
        buttonRandom = findViewById(R.id.buttonRandom)
        buttonAbout = findViewById(R.id.buttonAbout)
    }
}