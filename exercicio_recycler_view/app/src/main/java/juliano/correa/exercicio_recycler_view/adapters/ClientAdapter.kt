package juliano.correa.exercicio_recycler_view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import juliano.correa.exercicio_recycler_view.R
import juliano.correa.exercicio_recycler_view.model.Client
import kotlinx.android.synthetic.main.row_clients.view.*

class ClientAdapter(val clients: List<Client>, val context: Context, val listener: (Client) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //2.1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_clients, parent, false))
    }

    //1
    override fun getItemCount(): Int {
        return this.clients.size
    }

    //3
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val client = this.clients[position]

        if(holder is ViewHolder) {
            holder.bind(client, position, context, listener)
        }
    }

    public fun notifyInsertedList(){
        this.notifyItemInserted(clients.size)
    }

}//class ClientAdapter

//2.0
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(client: Client?, position: Int?, context: Context, listener: (Client) -> Unit) = with(itemView) {
        val rowClientsTextViewName = itemView.rowClientsTextViewName
        val rowClientsTextViewGender = itemView.rowClientsTextViewGender
        val rowClientsTextViewIncome = itemView.rowClientsTextViewIncome
        var rowClientsLayout = itemView.rowClientsLayout

        client?.let {
            rowClientsTextViewName.text = it.name.toString()
            rowClientsTextViewGender.text = it.gender.toString()
            rowClientsTextViewIncome.text = "R$ ${it.income.toString()}"

            itemView.setOnClickListener { listener(client) }

        }

        position?.let {
            if(position % 2 == 0) {
                rowClientsLayout.setBackgroundColor(getColor(context, android.R.color.holo_blue_dark))
            } else {
                rowClientsLayout.setBackgroundColor(getColor(context, android.R.color.holo_green_dark))
            }
        }
    }

}