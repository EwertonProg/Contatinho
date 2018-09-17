package ewerton.ucsal.com.danadinhas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var edNome: EditText? = null
    var edNumero: EditText? = null
    var edEmail: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edNome =  findViewById(R.id.edNome)
        edNumero = findViewById(R.id.edNumero)
        edEmail = findViewById(R.id.edEmail)
    }

    fun cadastrar(view: View){
        val nome: String = edNome!!.text.toString()
        val numero = edNumero!!.text.toString()
        val email = edEmail!!.text.toString()
        val danadinha: Danadinha = Danadinha(nome = nome,numero = numero, email = email)
        val intent = Intent(this, Lista::class.java)
        if (nome.isNotEmpty()||numero.isNotEmpty()){
            intent.putExtra("nome", nome)
            intent.putExtra("numero", numero)
            if (!email.isNullOrEmpty()){
                intent.putExtra("Email", email)
            }
            startActivity(intent)
        } else {
            Toast.makeText(this,"O nome e o numero não podem ser vazios",Toast.LENGTH_SHORT)
        }
    }
}
