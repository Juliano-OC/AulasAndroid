package juliano.correa.exercicio_quiz.model

import android.content.Context
import juliano.correa.exercicio_quiz.R

class Quiz {

    companion object {
        var context: Context? = null
//        init {
//
//            generateQuestions()
//            questionsShuffle()
//
//        }

        val questionsArray = ArrayList<Question>()

        fun generateQuestions() {


            questionsArray.add(Question(
                context!!.getText(R.string.question_one).toString(),
                context!!.getText(R.string.question_one_option_a).toString(),
                context!!.getText(R.string.question_one_option_b).toString(),
                context!!.getText(R.string.question_one_option_c).toString(),
                context!!.getText(R.string.question_one_option_b).toString()
            )
            )
            questionsArray.add(Question(
                    context!!.getText(R.string.question_two).toString(),
                    context!!.getText(R.string.question_two_option_a).toString(),
                    context!!.getText(R.string.question_two_option_b).toString(),
                    context!!.getText(R.string.question_two_option_c).toString(),
                    context!!.getText(R.string.question_two_option_a).toString()

            )
            )
            questionsArray.add(
                Question(
                    context!!.getText(R.string.question_three).toString(),
                    context!!.getText(R.string.question_three_option_a).toString(),
                    context!!.getText(R.string.question_three_option_b).toString(),
                    context!!.getText(R.string.question_three_option_c).toString(),
                    context!!.getText(R.string.question_three_option_a).toString()
                )
            )
            questionsArray.add(
                Question(
                    context!!.getText(R.string.question_four).toString(),
                    context!!.getText(R.string.question_four_option_a).toString(),
                    context!!.getText(R.string.question_four_option_b).toString(),
                    context!!.getText(R.string.question_four_option_c).toString(),
                    context!!.getText(R.string.question_four_option_c).toString()
                )
            )
            questionsArray.add(
                Question(
                    context!!.getText(R.string.question_five).toString(),
                    context!!.getText(R.string.question_five_option_a).toString(),
                    context!!.getText(R.string.question_five_option_b).toString(),
                    context!!.getText(R.string.question_five_option_c).toString(),
                    context!!.getText(R.string.question_five_option_c).toString()
                )
            )

            questionsArray.add(
                Question(
                    context!!.getText(R.string.question_six).toString(),
                    context!!.getText(R.string.question_six_option_a).toString(),
                    context!!.getText(R.string.question_six_option_b).toString(),
                    context!!.getText(R.string.question_six_option_c).toString(),
                    context!!.getText(R.string.question_six_option_b).toString()
                )
            )

            questionsArray.add(
                Question(
                    context!!.getText(R.string.question_seven).toString(),
                    context!!.getText(R.string.question_seven_option_a).toString(),
                    context!!.getText(R.string.question_seven_option_b).toString(),
                    context!!.getText(R.string.question_seven_option_c).toString(),
                    context!!.getText(R.string.question_seven_option_b).toString()
                )
            )

            questionsArray.add(
                Question(
                    context!!.getText(R.string.question_eight).toString(),
                    context!!.getText(R.string.question_eight_option_a).toString(),
                    context!!.getText(R.string.question_eight_option_b).toString(),
                    context!!.getText(R.string.question_eight_option_c).toString(),
                    context!!.getText(R.string.question_eight_option_a).toString()
                )
            )

            questionsArray.add(
                Question(
                    context!!.getText(R.string.question_nine).toString(),
                    context!!.getText(R.string.question_nine_option_a).toString(),
                    context!!.getText(R.string.question_nine_option_b).toString(),
                    context!!.getText(R.string.question_nine_option_c).toString(),
                    context!!.getText(R.string.question_nine_option_a).toString()
                )
            )

            questionsArray.add(
                Question(
                    context!!.getText(R.string.question_ten).toString(),
                    context!!.getText(R.string.question_ten_option_a).toString(),
                    context!!.getText(R.string.question_ten_option_b).toString(),
                    context!!.getText(R.string.question_ten_option_c).toString(),
                    context!!.getText(R.string.question_ten_option_a).toString()
                )
            )
        }


        fun questionsShuffle() {
            questionsArray.shuffle()
        }

        fun score(): Int {
            var score = 0
            for (question in questionsArray) {
                if (question.correctAnswer) {
                    score++
                }
            }
            return score
        }

        fun checkAverageOfCorrectAnswers(): Double {
            return (score() / 3.0) * 100
        }

        fun finalMessage(): String {
            if (checkAverageOfCorrectAnswers() > 80) {
                return context!!.getText(R.string.final_message_great).toString()
            } else if (checkAverageOfCorrectAnswers() > 50) {
                return context!!.getText(R.string.final_message_not_bad).toString()
            } else {
                return context!!.getText(R.string.final_message_you_suck).toString()
            }
        }

        fun verifyTheCorrectAnswer(answer: String): Boolean {
            if (answer.equals(questionsArray.get(0).correctOptionAnswer)) {
                questionsArray.get(0).correctAnswer = true
                return true
            } else {
                return false
            }
        }

        fun clearAll() {
            questionsArray.clear()
            generateQuestions()
        }
    }
}