package ewerton.ucsal.com.danadinhas

import android.content.Context

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_danadinha.view.*

class MeuAdapter(val danadinhas: MutableList<Danadinha>, val contexto: Context): RecyclerView.Adapter<MeuAdapter.MeuViewHolder>() {


    class MeuViewHolder(view: View): RecyclerView.ViewHolder(view){
        val nome = view.item_nome
        val numero = view.item_numero
        val email = view.item_email

    }

    override fun getItemCount(): Int {
        return danadinhas.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MeuAdapter.MeuViewHolder {

        val view: View = LayoutInflater.from(contexto).inflate(R.layout.item_danadinha, p0, false)

        return MeuViewHolder(view)

    }

    override fun onBindViewHolder(p0: MeuViewHolder, p1: Int) {
        val danadinhas = Danadinha.danadinhas.get(p1)
        p0.nome.text = danadinhas.nome
        p0.numero.text = danadinhas.numero
        p0.email.text = danadinhas.email
    }


}