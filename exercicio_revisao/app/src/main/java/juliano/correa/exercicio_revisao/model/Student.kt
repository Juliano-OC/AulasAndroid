package juliano.correa.exercicio_revisao.model

import android.content.Context

class Student (var name: String, var grade1: Double, var grade2: Double, context: Context) {

    public fun calculateAverage(): Double {
        return  (grade1 + grade2)/2
    }

    public fun verifyGrade() : String {
        if (calculateAverage()>6) {
            return  "Approved " + calculateAverage()
        } else {
            return "Reproved " + calculateAverage()}
    }

    override fun toString(): String {
        return "Student name: $name\n Grade1: $grade1\n Grade2: $grade2,\n Average: ${calculateAverage()}"
    }
}