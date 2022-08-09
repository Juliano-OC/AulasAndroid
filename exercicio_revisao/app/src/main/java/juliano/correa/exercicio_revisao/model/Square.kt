package juliano.correa.exercicio_revisao.model

import android.content.Context

class Square(var side: Double, context: Context) {

    public fun calculateArea(): String {
      return "The area of the square is: " + side * side
    }

    public fun calculatePerimeter(): String {
      return  "The perimeter of the square is: " + side * 4
    }

    override fun toString(): String {
        return "Square side: $side\n ${calculatePerimeter()}\n ${calculateArea()}"
    }
}