package juliano.correa.exercicio_serializable_ligacao_texto

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import juliano.correa.exercicio_serializable_ligacao_texto.model.User

class Screen1 : AppCompatActivity() {

    private lateinit var buttonShare : Button
    private lateinit var editTextTypeSomething : EditText
    private lateinit var editTextPhone : EditText
    private lateinit var buttonCall : Button
    private val CALL_PHONE_REQUEST_CODE: Int = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen1)

        initializer()

        buttonCall.setOnClickListener {
            makeCall()
        }

        buttonShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, editTextTypeSomething.text.toString())
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

        val user = intent.getParcelableExtra<User>("user")

        Toast.makeText(baseContext, "Email: ${user}", Toast.LENGTH_LONG).show()

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when(requestCode) {
            CALL_PHONE_REQUEST_CODE -> {
                if(grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(baseContext, getText(R.string.toast_msg), Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(baseContext, "eeee... Agora vou efetuar a ligação!", Toast.LENGTH_LONG).show()
                    makeCall()
                }
            }
        }

    }

    private fun requestPermission() {
        ActivityCompat.requestPermissions(
            this@Screen1,
            arrayOf(Manifest.permission.CALL_PHONE),
            CALL_PHONE_REQUEST_CODE)
    }

    private fun makeCall() {
        val phone = editTextPhone.text.toString()
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$phone"))

        if(ActivityCompat.checkSelfPermission(this@Screen1, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            startActivity(intent)
        } else {
            //negado....
            if(ActivityCompat.shouldShowRequestPermissionRationale(this@Screen1, Manifest.permission.CALL_PHONE)) {
                Toast.makeText(baseContext,  "Preciso desta permissão para efetuar a ligação!", Toast.LENGTH_LONG).show()
            }
            requestPermission()
        }
    }

    private fun initializer() {
        buttonShare = findViewById(R.id.buttonShare)
        editTextTypeSomething = findViewById(R.id.editTextTypeSomething)
        buttonCall = findViewById(R.id.buttonCall)
        editTextPhone = findViewById(R.id.editTextPhone)
    }
}