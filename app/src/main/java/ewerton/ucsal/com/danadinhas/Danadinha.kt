package ewerton.ucsal.com.danadinhas

import android.provider.ContactsContract

class Danadinha(nome: String, numero: String, email: String? = null) {
    var nome = nome.trim()

    var numero = numero.trim()

    var email: String? = email
        set(value){
            field = if (!value.equals(field)) value?.trim() else field
        }
    companion object {
        var danadinhas: MutableList<Danadinha> = ArrayList<Danadinha>()
        fun add(danadinha: Danadinha){
            danadinhas.add(danadinha)
        }
    }


}