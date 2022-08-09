package juliano.correa.exercicio_enviar_dados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editTextTypeYourName : EditText
    private lateinit var buttonLogin : Button
    private val TAG_LOG_MAIN_ACTIVITY: String = "Log MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onCreate")
        initializer()

        buttonLogin.setOnClickListener {
            if(editTextTypeYourName.text.toString().isNotEmpty()) {
                val name = editTextTypeYourName.text.toString()

                editTextTypeYourName.text.clear()

                val intent = Intent (this@MainActivity, Screen1::class.java)
                intent.putExtra("name", name)
                startActivity(intent)

            } else {
                Toast.makeText(baseContext, "Preencha o campo obrigatório", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onRestart")
    }

    private fun initializer() {
        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no initializer")

        editTextTypeYourName = findViewById(R.id.editTextTypeYourName)
        buttonLogin = findViewById(R.id.buttonLogin)
    }
}