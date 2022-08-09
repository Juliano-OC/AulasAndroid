package juliano.correa.exercicio_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import juliano.correa.exercicio_spinner.model.User
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var editTextTypeYourName: EditText
    private lateinit var spinnerGender : Spinner
    private lateinit var textView : TextView
    private lateinit var buttonConfirm : Button
    private lateinit var layout:ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonConfirm.setOnClickListener {

            val gender = spinnerGender.selectedItem.toString()

            //val user = User(spinnerGender.selectedItem.toString())

            if(spinnerGender.selectedItemPosition == 0) {
                toast("Select a gender")
                layout.setBackgroundColor(getColor(R.color.amber200))
                return@setOnClickListener
            } else if(spinnerGender.selectedItemPosition == 1) {
                layout.setBackgroundColor(getColor(R.color.yellow300))
                return@setOnClickListener
            } else
                layout.setBackgroundColor(getColor(R.color.blue400))
        }

        spinnerGender.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (p2 != 0) {
//                    val gender = spinnerGender.getItemAtPosition(p2).toString()

                    val user = User(spinnerGender.getItemAtPosition(p2).toString(), editTextTypeYourName.text.toString(), this@MainActivity)

                    toast("${user.toString()}")
                }
            }
        }
    }

    private fun initializer() {
        editTextTypeYourName = findViewById(R.id.editTextTypeYourName)
        spinnerGender = findViewById(R.id.spinnerGender)
        textView = findViewById(R.id.textViewResponse)
        buttonConfirm = findViewById(R.id.buttonConfirm)
        layout = findViewById(R.id.layout)
    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }
}
