package juliano.correa.exercicio_enviar_dados

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_screen1.*

class Screen1 : AppCompatActivity() {

    private lateinit var editTextTypeUrl : EditText
    private lateinit var buttonBrowse : Button
    private lateinit var viewTextResponse : TextView
    private val TAG_LOG_MAIN_ACTIVITY: String = "Log Screen1"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onCreate")
        initializer()

        buttonBrowse.setOnClickListener {
            val URL = editTextTypeUrl.text.toString()

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://${URL}"))
            startActivity(intent)

        }

        val name = intent.getStringExtra("name")

        Toast.makeText(baseContext, "Name: $name", Toast.LENGTH_LONG).show()

        textViewResponse.text = "You're logged in " + name
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
        editTextTypeUrl = findViewById(R.id.editTextTypeUrl)
        buttonBrowse = findViewById(R.id.buttonBrowse)
        viewTextResponse = findViewById(R.id.textViewResponse)
    }
}