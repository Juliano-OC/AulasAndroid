package juliano.correa.exercicio_recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import juliano.correa.exercicio_recycler_view.Extensions.toast
import juliano.correa.exercicio_recycler_view.adapters.ClientAdapter
import juliano.correa.exercicio_recycler_view.model.Client
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ClientAdapter
    private var clients = arrayListOf<Client>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonOK.setOnClickListener {
            var client = Client(editTextTextName.text.toString(), editTextGender.text.toString(), editTextIncome.text.toString().toDouble())
            //Adicionando o objeto a nossa lista
            this.clients.add(client)
//            adapter.notifyDataSetChanged()

            adapter.notifyInsertedList()

            toast("Cliente adicionado com sucesso!")
        }

    }

    private fun resultItemClicked(client: Client) {
        //aqui vou resgatar o objeto da lista
        toast("CLICOU EM: ${client.toString()}")
    }

    private fun initializer() {
        //setando o adapter
        adapter = ClientAdapter(clients, this@MainActivity, { client: Client -> resultItemClicked(client)})
        recyclerViewClients.adapter = adapter

        //Setando o layout da RecyclerView - linear, staggered....
//        recyclerViewClients.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerViewClients.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    }
}