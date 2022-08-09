package juliano.correa.exercicio_serializable_ligacao_texto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import juliano.correa.exercicio_serializable_ligacao_texto.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var buttonLogin : Button
    private lateinit var editTextEmail : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonLogin.setOnClickListener {
            val user = User(editTextEmail.text.toString())

            val intent = Intent(this@MainActivity, Screen1::class.java)
            intent.putExtra("user", user)
            startActivity(intent)
        }

    }

    private fun initializer() {
        buttonLogin = findViewById(R.id.buttonLogin)
        editTextEmail = findViewById(R.id.editTextEmail)
    }
}