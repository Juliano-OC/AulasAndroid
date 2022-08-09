package juliano.correa.exercicio_para_entregar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import juliano.correa.exercicio_para_entregar.model.Month

class MainActivity : AppCompatActivity() {

    private lateinit var buttonShow: Button
    private lateinit var editTextNumberInt: EditText
    private lateinit var textViewResponse: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonShow.setOnClickListener {
            val month = Month(editTextNumberInt.text.toString().toInt(), this@MainActivity)
            textViewResponse.text = month.verifyMonth()
        }

    }

    private fun initializer() {
        buttonShow = findViewById(R.id.buttonShow)
        editTextNumberInt = findViewById(R.id.editTextNumberInt)
        textViewResponse = findViewById(R.id.textViewResponse)
    }
}