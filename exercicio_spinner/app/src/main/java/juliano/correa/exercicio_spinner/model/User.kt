package juliano.correa.exercicio_spinner.model

import android.content.Context
import juliano.correa.exercicio_spinner.R

class User(var gender: String, var name: String, val context: Context) {

    override fun toString(): String {
        return "${context.getString(R.string.user_name)} $name \n${context.getString(R.string.user_gender)}$gender"
    }

}