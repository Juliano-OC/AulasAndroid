package juliano.correa.exercicio_revisao

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class DialScreen : AppCompatActivity() {

    private lateinit var buttonDial : Button
    private lateinit var editTextPhone : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dial_screen)

        initializer()

        buttonDial.setOnClickListener {
            val phone = editTextPhone.text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${phone}"))
            startActivity(intent)
        }

    }

    private fun initializer() {
        buttonDial = findViewById(R.id.buttonDial)
        editTextPhone = findViewById(R.id.editTextPhone)
    }
}