package juliano.correa.exercicio_quiz.model

import android.content.Context
import androidx.core.content.ContentProviderCompat.requireContext
import juliano.correa.exercicio_quiz.R

class Question(
                var questionDescription: String,
                var option1: String,
                var option2: String,
                var option3: String,
                var correctOptionAnswer: String) {

    var correctAnswer: Boolean = false

    override fun toString(): String {
        return "Question(questionDescription='$questionDescription', option1='$option1', option2='$option2', option3='$option3', correctOptionAnswer='$correctOptionAnswer', correctAnswer=$correctAnswer)"
    }

}
