package juliano.correa.exercicio_recycler_view.model

class Client(var name: String,
             var gender: String,
             var income: Double) {

    override fun toString(): String {
        return "Client(name='$name', gender='$gender', income=$income)"
    }
}