package juliano.correa.exercicio_quiz

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import juliano.correa.exercicio_quiz.extension.toast
import juliano.correa.exercicio_quiz.model.Quiz
import kotlinx.android.synthetic.main.activity_3.*

class Activity3 : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        activity3ButtonNext.visibility = View.INVISIBLE

        Quiz.questionsShuffle()

        val questions = Quiz.questionsArray.get(0)

        getScore()

        activity3TextViewDescription.text = questions.questionDescription
        activity3RadioGroupOption1.text = questions.option1
        activity3RadioGroupOption2.text = questions.option2
        activity3RadioGroupOption3.text = questions.option3

        activity3ButtonAnswer.setOnClickListener {
            activity3ButtonNext.visibility = View.VISIBLE
            activity3ButtonAnswer.visibility = View.INVISIBLE

            val id = activity3RadioGroup.checkedRadioButtonId
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

        activity3ButtonNext.setOnClickListener {
            startActivity(Intent(this@Activity3, Activity4::class.java))
        }
    }

    fun getScore() {
        activity3TextViewScore.text = Quiz.score().toString()
    }

    private fun play(sound: Int) {
        mediaPlayer = MediaPlayer.create(this@Activity3, sound)
        mediaPlayer.start()
    }

    private fun stop() {
        if(mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
    }
}