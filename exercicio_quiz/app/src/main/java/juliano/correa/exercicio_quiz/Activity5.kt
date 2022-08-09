package juliano.correa.exercicio_quiz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

import juliano.correa.exercicio_quiz.FinalQuiz
import juliano.correa.exercicio_quiz.R
import juliano.correa.exercicio_quiz.extension.toast
import juliano.correa.exercicio_quiz.model.Question
import juliano.correa.exercicio_quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_5.*

class Activity5 : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)


        activity5ButtonNext.visibility = View.INVISIBLE


        Quiz.questionsShuffle()

        val questions = Quiz.questionsArray.get(0)

        getScore()

        activity5TextViewDescription.text = questions.questionDescription
        activity5RadioGroupOption1.text = questions.option1
        activity5RadioGroupOption2.text = questions.option2
        activity5RadioGroupOption3.text = questions.option3

        activity5ButtonAnswer.setOnClickListener {
            activity5ButtonNext.visibility = View.VISIBLE
            activity5ButtonAnswer.visibility = View.INVISIBLE

            val id = activity5RadioGroup.checkedRadioButtonId
            val radio: RadioButton = findViewById(id)

            if(Quiz.verifyTheCorrectAnswer(radio.text.toString())) {
                toast(getText(R.string.correct_option).toString())
                play(R.raw.right)
                getScore()
            } else {
                toast(getText(R.string.incorrect_option).toString())
                play(R.raw.wrong)
            }
        }

        activity5ButtonNext.setOnClickListener { startActivity(Intent(this@Activity5, FinalQuiz::class.java))
        }
    }

    fun getScore() {
        activity5TextViewScore.text = Quiz.score().toString()
    }

    private fun play(sound: Int) {
        mediaPlayer = MediaPlayer.create(this@Activity5, sound)
        mediaPlayer.start()
    }

    private fun stop() {
        if(mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
    }
}