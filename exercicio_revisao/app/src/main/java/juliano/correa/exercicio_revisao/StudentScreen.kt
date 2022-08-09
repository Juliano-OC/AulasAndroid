package juliano.correa.exercicio_revisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import juliano.correa.exercicio_revisao.model.Student

class StudentScreen : AppCompatActivity() {

    private lateinit var editTextStudent : EditText
    private lateinit var editTextGrade1 : EditText
    private lateinit var editTextGrade2 : EditText
    private lateinit var buttonAdd : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_screen)

        initializer()

        buttonAdd.setOnClickListener {

            val student = Student(editTextStudent.text.toString(), editTextGrade1.text.toString().toDouble(), editTextGrade2.text.toString().toDouble(), this@StudentScreen)

            toast("Student got ${student.verifyGrade()}")

            clear()
        }

        buttonAdd.setOnLongClickListener(object: View.OnLongClickListener{

            override fun onLongClick(p0: View?): Boolean {
                val student = Student(editTextStudent.text.toString(), editTextGrade1.text.toString().toDouble(), editTextGrade2.text.toString().toDouble(), this@StudentScreen)

                var alert1 = AlertDialog.Builder(this@StudentScreen)
                alert1.setMessage(student.toString())
                alert1.show()
                return true
            }
        })
    }

    private fun initializer() {
        editTextStudent = findViewById(R.id.editTextStudent)
        editTextGrade1 = findViewById(R.id.editTextGrade1)
        editTextGrade2 = findViewById(R.id.editTextGrade2)
        buttonAdd = findViewById(R.id.buttonAdd)
    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }

    private fun clear() {
        editTextStudent.text.clear()
        editTextGrade1.text.clear()
        editTextGrade2.text.clear()
    }
}