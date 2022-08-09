package juliano.correa.hollowlator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var typeYourName: EditText
    private lateinit var typeYourAge: EditText
    private lateinit var seeResult: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        refs
        typeYourName = findViewById(R.id.editTextTextName)
        typeYourAge = findViewById(R.id.editTextTextAge)
        seeResult = findViewById(R.id.button_see_result)
        result = findViewById(R.id.textView_result)



        seeResult.setOnClickListener {
            var name = typeYourName.text.toString()
            var age = typeYourAge.text.toString().toInt()

            val random = (0..100).random()
            val response = "${getText(R.string.message_name)} $name \n ${getText(R.string.message_age)} $age\n ${getText(R.string.you_are)} $random % ${getText(R.string.freaked_out)}"

            Toast.makeText(this@MainActivity,response, Toast.LENGTH_SHORT).show()

            result.text = response

            clean()
        }
    }
    private fun clean() {
        typeYourName.text.clear()
        typeYourAge.text.clear()
    }
}

