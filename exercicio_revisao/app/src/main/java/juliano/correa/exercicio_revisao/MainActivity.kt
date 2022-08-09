package juliano.correa.exercicio_revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonDial : Button
    private lateinit var buttonStudent : Button
    private lateinit var buttonSquare : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonDial.setOnClickListener {
            val intent = Intent (this@MainActivity, DialScreen::class.java)
            startActivity(intent)
        }

        buttonStudent.setOnClickListener {
            val intent = Intent (this@MainActivity, StudentScreen::class.java)
            startActivity(intent)
        }

        buttonSquare.setOnClickListener {
            val intent = Intent (this@MainActivity, SquareScreen::class.java)
            startActivity(intent)
        }
    }

    private fun initializer() {
        buttonDial = findViewById(R.id.buttonDial)
        buttonStudent = findViewById(R.id.buttonStudent)
        buttonSquare = findViewById(R.id.buttonSquare)
    }
}