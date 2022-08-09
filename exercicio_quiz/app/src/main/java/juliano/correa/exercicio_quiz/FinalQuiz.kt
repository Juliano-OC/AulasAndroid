package juliano.correa.exercicio_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import juliano.correa.exercicio_quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_final_quiz.*

class FinalQuiz : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_quiz)


        getScore()

        finalQuizTextViewCorrectAnswers.text = "${Quiz.checkAverageOfCorrectAnswers()}%"

        finalQuizTextViewFinalMessage.text = Quiz.finalMessage()

        finalQuizButtonPlayAgain.setOnClickListener {
            Quiz.clearAll()
            startActivity(Intent(this@FinalQuiz, Activity1::class.java))
            finish()
        }
    }

    fun getScore() {
        finalQuizTextViewScore.text = Quiz.score().toString()
    }
}