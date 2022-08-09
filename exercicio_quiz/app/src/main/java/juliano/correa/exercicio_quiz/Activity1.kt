package juliano.correa.exercicio_quiz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import juliano.correa.exercicio_quiz.extension.toast

import juliano.correa.exercicio_quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_1.*
import kotlinx.android.synthetic.main.activity_1.activity1ButtonNext
import kotlinx.android.synthetic.main.activity_1.activity1TextViewDescription

class Activity1 : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        activity1ButtonNext.visibility = View.INVISIBLE

        Quiz.context= this@Activity1
        Quiz.generateQuestions()
        Quiz.questionsShuffle()


        val questions = Quiz.questionsArray.get(0)

        getScore()

        activity1TextViewDescription.text = questions.questionDescription
        activity1RadioGroupOption1.text = questions.option1
        activity1RadioGroupOption2.text = questions.option2
        activity1RadioGroupOption3.text = questions.option3

        activity1ButtonAnswer.setOnClickListener {
            activity1ButtonNext.visibility = View.VISIBLE
            activity1ButtonAnswer.visibility = View.INVISIBLE

            val id = activity1RadioGroup.checkedRadioButtonId
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

        activity1ButtonNext.setOnClickListener {
            startActivity(Intent(this@Activity1, Activity2::class.java))
        }
    }

    fun getScore() {
        activity1TextViewScore.text = Quiz.score().toString()
    }

    private fun play(sound: Int) {
        mediaPlayer = MediaPlayer.create(this@Activity1, sound)
        mediaPlayer.start()
    }

    private fun stop() {
        if(mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
    }
}
