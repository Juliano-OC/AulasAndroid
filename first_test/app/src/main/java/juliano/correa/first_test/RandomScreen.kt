package juliano.correa.first_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RandomScreen : AppCompatActivity() {

    private lateinit var buttonRandomizer: Button
    private lateinit var textViewResponse: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_screen)

        initializer()

        buttonRandomizer.setOnClickListener {

            val random = (0..100).random()
            val response = "${getText(R.string.your_lucky_number_is)} $random"

            textViewResponse.text = response

        }
    }

    private fun initializer() {
        buttonRandomizer = findViewById(R.id.buttonRandomizer)
        textViewResponse = findViewById(R.id.textViewResponse)
    }
}