package juliano.correa.exercicio_filme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import juliano.correa.exercicio_filme.model.Movie

class MainActivity : AppCompatActivity() {

    private lateinit var editTextMovieName : EditText
    private lateinit var spinnerGenre : Spinner
    private lateinit var spinnerYear : Spinner
    private lateinit var radioGroup : RadioGroup
    private lateinit var buttonRegister : Button
    private lateinit var textViewResponse : TextView
    private lateinit var layout: ConstraintLayout
    private lateinit var adapter: ArrayAdapter<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonRegister.setOnClickListener {

            val year = spinnerYear.selectedItem.toString()

            //val user = User(spinnerGender.selectedItem.toString())

            if(spinnerYear.selectedItemPosition == 0) {
                toast("Select a year")
                layout.setBackgroundColor(getColor(R.color.amber200))
                return@setOnClickListener
            } else if(spinnerYear.selectedItemPosition == 1) {
                layout.setBackgroundColor(getColor(R.color.yellow300))
                return@setOnClickListener
            } else
                layout.setBackgroundColor(getColor(R.color.blue400))
        }

//        ---->SPINNER YEAR
        spinnerYear.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (p2 != 0) {
                    val year = spinnerYear.getItemAtPosition(p2).toString()

//                    val movie = Movie(spinnerGenre.getItemAtPosition(p2).toString(), , this@MainActivity)

                    toast("${year.toString()}")
                }
            }
        }

//        ---->SPINNER GENDER

        spinnerGenre.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2 != 0) {
                    val genre = spinnerGenre.getItemAtPosition(p2).toString()
                    toast("${genre.toString()}")
                }
            }
        }

//        ------>Radio GROUP

        radioGroup.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

                val movie = Movie(editTextMovieName.text.toString(), spinnerYear.selectedItem.toString().toInt(), spinnerGenre.selectedItem.toString(), radio.text.toString(), this@MainActivity)

                textViewResponse.text = movie.toString() +  "\n" + movie.verifyRecommendation() + "\n" + movie.verifyGenre()
            }
        )

        buttonRegister.setOnClickListener {
            if(radioGroup.checkedRadioButtonId != -1) {

                val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)

                val movie = Movie(editTextMovieName.text.toString(), spinnerYear.selectedItem.toString().toInt() , spinnerGenre.selectedItem.toString(), radio.toString(), this@MainActivity)

                Toast.makeText(baseContext, movie.toString(), Toast.LENGTH_LONG).show()
                Toast.makeText(baseContext, movie.verifyRecommendation(), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(baseContext, "Select a recommendation!", Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun initializer() {
        editTextMovieName = findViewById(R.id.editTextMovieName)
        spinnerGenre = findViewById(R.id.spinnerGenre)
        spinnerYear = findViewById(R.id.spinnerYear)
        radioGroup = findViewById(R.id.radioGroup)
        buttonRegister = findViewById(R.id.buttonRegister)
        textViewResponse = findViewById(R.id.textViewResponse)
        layout = findViewById(R.id.layout)

        val listGenre = arrayOf("Select a genre", "Comedy", "Drama", "Fantasy")

        adapter = ArrayAdapter(
            this@MainActivity,
            android.R.layout.simple_dropdown_item_1line,
            listGenre)

        spinnerGenre.adapter = adapter
    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }
}