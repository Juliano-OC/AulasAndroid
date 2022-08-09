package juliano.correa.exercicio_revisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import juliano.correa.exercicio_revisao.model.Square

class SquareScreen : AppCompatActivity() {

    private lateinit var editTextSideSquare: EditText
    private lateinit var spinnerSquare: Spinner
    private lateinit var buttonCalculate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_screen)

        initializer()

        buttonCalculate.setOnClickListener {
            val square = Square(editTextSideSquare.text.toString().toDouble(), this@SquareScreen)
            val response = spinnerSquare.selectedItem.toString()

            if(response.contentEquals("Area")) {
                toast("${square.calculateArea()}")
            } else if(response.contentEquals("Perimeter")) {
                toast("${square.calculatePerimeter()}")
            } else {
            toast("${square.toString()}")
            }
        }
    }

    private fun initializer() {
        editTextSideSquare = findViewById(R.id.editTextSideSquare)
        spinnerSquare = findViewById(R.id.spinnerSquare)
        buttonCalculate = findViewById(R.id.buttonCalculate)
    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }
}