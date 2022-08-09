package juliano.correa.first_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import juliano.correa.first_test.model.Calculator

class CalculatorScreen : AppCompatActivity() {

    private lateinit var editTextValue1: EditText
    private lateinit var editTextValue2: EditText
    private lateinit var spinnerOperation: Spinner
    private lateinit var buttonCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_screen)

        initializer()

        buttonCalculate.setOnClickListener {
            val calculator = Calculator(editTextValue1.text.toString().toDouble(), editTextValue2.text.toString().toDouble(), this@CalculatorScreen)
            val response = spinnerOperation.selectedItem.toString()

            if(response.contentEquals("${baseContext.getString(R.string.spinner_add)}")) {
                toast("${calculator.calculateAdd()}")
            } else if(response.contentEquals("${baseContext.getString(R.string.spinner_subtract)}")) {
                toast("${calculator.calculateSubtraction()}")
            } else if(response.contentEquals("${baseContext.getString(R.string.spinner_divide)}")) {
                toast("${calculator.calculateDivision()}")
            } else if(response.contentEquals("${baseContext.getString(R.string.spinner_multiply)}")) {
                toast("${calculator.calculateMultiplication()}")
            } else {
                toast("${calculator.toString()}")
            }
        }

    }

    private fun initializer() {
        editTextValue1 = findViewById(R.id.editTextValue1)
        editTextValue2 = findViewById(R.id.editTextValue2)
        spinnerOperation = findViewById(R.id.spinnerOperation)
        buttonCalculate = findViewById(R.id.buttonCalculate)
    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }
}