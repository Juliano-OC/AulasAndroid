package juliano.correa.first_test.model

import android.content.Context
import juliano.correa.first_test.R

class Calculator(var value1: Double, var value2: Double, val context: Context) {

    fun calculateAdd() : String {
       return "${context.getString(R.string.string_add)} " + (value1 + value2)
    }

    fun calculateSubtraction() : String {
        return "${context.getString(R.string.string_subtraction)} " + (value1 - value2)
    }

    fun calculateDivision() : String {
        return "${context.getString(R.string.string_division)} " + (value1/value2)
    }

    fun calculateMultiplication() : String {
        return "${context.getString(R.string.string_multiplication)} " + (value1*value2)
    }

    override fun toString(): String {
        return " ${context.getString(R.string.string_value1)} $value1 \n ${context.getString(R.string.string_value2)} $value2 \n ${calculateAdd()} \n ${calculateSubtraction()} \n ${calculateDivision()} \n ${calculateMultiplication()}"
    }
}