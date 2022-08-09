package juliano.correa.exercicio_filme.model

import android.content.Context
import juliano.correa.exercicio_filme.R

class Movie(var name: String, var year: Int, var genre: String, var recommendation: String, val context: Context) {

    public fun verifyGenre(): String {
        when(this.genre) {
            "Comedy" -> {
                return "You choose Comedy"
            }
            "Drama" -> {
                return "You choose Drama"
            }
            else -> {
                return "You choose Fantasy"
            }
        }
    }

    public fun verifyRecommendation(): String {
        when(this.recommendation) {
            "Bad" -> {
                return "This movie is trash."
            }
            "Good" -> {
                return "Yes, you can watch it.."
            }
            else -> {
                return "OMG, this movie is perfect."
            }
        }
    }

    override fun toString(): String {
        return "${context.getString(R.string.movie_name)} $name \n${context.getString(R.string.movie_year)} $year \n${context.getString(R.string.movie_genre)} $genre \n${context.getString(R.string.movie_recommendation)} $recommendation"
    }
}