package mx.com.debite.miaplicacinbuap

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val miNumero = 2 // val inmutable
        val string = "Hola"
        val flotante = 0.23f
        val doble = 0.24

        var myNumber = miNumero.inc() // var mutable
        var cadena = "Hello"

        val mibooleano = true or false

        val interpolada = "Mi variable es ${miNumero.inc() + 98}"

        val json = """ { "mi llave" : "hola" } """ // generar json desde string

        var nul = "No se nulo" // explicitamente null con ?
        // val size = nul!!.length // !! asegura que la variable no es nula
        val size2 = nul?.length ?: -1 // ? posiblemente no es null // elvis operator

        val carro = Carro("Azul","2018")
        Estatica.metodoEstatico()

        Log.d("Ejemplo de Log", carro.toString())
    }
}

data class Carro (val color:String, val modelo:String)

class Tren (val vagones:Int): Mover{
    override fun detener(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class Estatica{
    companion object { // todas las cosas estaticas
        fun metodoEstatico():String = "Esto es estatico"
    }
}

interface Mover {

    fun arrancar():String = "Run run"

    fun detener():String

}