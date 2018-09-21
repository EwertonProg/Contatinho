package ewerton.ucsal.com.danadinhas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class Lista : AppCompatActivity() {
    lateinit var rv : RecyclerView
    lateinit var danadinhas : MutableList<Danadinha>
    lateinit var va: RecyclerView.Adapter<*>
    lateinit var vm: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        // Recuperando o recycleView do layout
        rv = findViewById(R.id.recyclerView)
        danadinhas = Danadinha.danadinhas

        vm = LinearLayoutManager(this)
        va = MeuAdapter(danadinhas, this)

        // Definindo o LayoutManager do recycleView
        rv.layoutManager = vm

        // Definindo o Adapter do recycleView
        rv.adapter = va
    }
}
