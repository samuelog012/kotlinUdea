package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>

        val values = arrayOf(
            "Android", "iPhone", "WindowsMobile",
            "Blackberry", "WebOS", "Ubuntu", "Windows7", "MacOS X",
            "Linux", "Windows8.1", "Lollipop", "iOS",
            "Lubuntu", "Kali linux", "Windows10", "Windows XP",
            "Symbian"
        )

//        var mListView = findViewById<ListView>(R.id.my_list_view)

//        arrayAdapter = ArrayAdapter(this,
//            android.R.layout.simple_list_item_1, values)
//        mListView.adapter = arrayAdapter

//        calculadora(25f, 2f)
//        val respuesta:String = concatenar("Juan","Julian","Perez","Pinto")
//        println(respuesta)
//        variablesContantes()
    }

//    private fun variablesContantes() {
//        var entero: Int = 1003
//        var cadena: String = "David"
//        var booleano: Boolean = true // false
//        var decimal: Float = 1234.556789f
//        var caracter: Char = 'A'

//        entero = 80
//        entero = 76-39
//        println("Esta es la variable 1: $entero")
//        entero = 10+10
//        println("Esta es la variable 1: $entero")
//        entero = 10-10
//        println("Esta es la variable 1: $entero")
//        entero = 10*10
//        println("Esta es la variable 1: $entero")
//        entero = 10/10
//        println("Esta es la variable 1: $entero")

//        println("Esta es la variable 1: $cadena")
//        cadena = "Chaves"
//        println("Esta es la variable 1: $cadena")
//        cadena = "a"
//        println("Esta es la variable 1: $cadena")

//        booleano = false
//        println("Esta es la variable 1: $booleano")
//        booleano = true
//        println("Esta es la variable 1: $booleano")
//
//        val pi = 3.14159
//
//        println("Esta es la variable 1: $entero")
//        println("Esta es la variable 2: $cadena")
//        println("Esta es la variable 3: $booleano")
//        println("Esta es la variable 4: $decimal")
//        println("Esta es la variable 5: $caracter")
//        println("Esta es constante 1: $pi")

//        var nombre1: String = "David"
//        var nombre2: String = "Fernando"
//        var apellido1: String = "Chaves"
//        var apellido2: String = "Tamayo"
//        var edadString: String = "40"
//        var edad : Int = 31
//
//        var nombreCompleto: String = "$nombre1 $nombre2 $apellido1 $apellido2 $edad"
//        nombreCompleto = nombreCompleto.toLowerCase()
//        println(nombreCompleto)
//        nombreCompleto = nombreCompleto.toUpperCase()
//        println(nombreCompleto)

//        var edad1 = 43
//        val edad2 = 40
//
//        if(edad1 >= 45){
//            println("Su edad esta por encima de los 45: $edad1")
//        } else if (edad1 <= 43){
//            println("Su edad es 43: $edad1")
//        } else {
//            println("Su edad esta por debajo de los 45: $edad1")
//        }

//        var edad1 = 45
//        var edad2 = 40
//
//        var resultado: Int = if (edad1 == edad2) {
//            edad1
//        } else {
//            edad2
//        }

//        println("El resultado es : $resultado")

//        var mes = 13
//
//        when (mes) {
//            1 -> println("Enero")
//            2 -> println("Febrero")
//            3 -> println("Marzo")
//            4 -> println("Abril")
//            5 -> println("Mayo")
//            6 -> println("Junio")
//            7 -> println("Julio")
//            8 -> println("Agosto")
//            9 -> println("Septiembre")
//            10 -> println("Octubre")
//            11 -> println("Noviembre")
//            12 -> println("Diciembre")
//            else -> {
//                println("Su numero no esta asiganado a un mes")
//            }
//        }
//
//        mes = 7
//        when (mes) {
//            1,2,3,4 -> println("Usted escogio un mes del primer cuatrimestre")
//            5,6,7,8 -> println("Usted escogio un mes del segundo cuatrimestre")
//            9,10,11,12 -> println("Usted escogio un mes del tercero cuatrimestre")
//            else -> {
//                println("Su numero no esta asiganado a un mes")
//            }
//        }
//
//        mes = 247
//        when (mes) {
//            in 1..4 -> println("Usted escogio un mes del primer cuatrimestre")
//            in 5..8 -> println("Usted escogio un mes del segundo cuatrimestre")
//            in 9..12 -> println("Usted escogio un mes del tercero cuatrimestre")
//            !in 1..12 -> println("Su numero no esta asiganado a un mes")
//        }

//        var dato: Any = false
//        when (dato) {
//            is Int -> println("Este es un entero")
//            is String -> println("Este es un String")
//            is Boolean -> println("Este es un Boolean")
//        }

//        for (numero in 0..100){
//            println("El valor del numero es: $numero")
//        }
//
//        for (numero in 0..100 step 5){
//            println("El valor del numero es: $numero")
//        }
//
//        for (numero in 100 downTo 50 step 2){
//            println("El valor del numero es: $numero")
//        }

//        for (numero in 0 until 10){
//            println("El valor del numero es: $numero")
//        }
//
//        var i = 0
//
//        while (i < 10){
//            println("Todavia soy menor a 10 $i")
//            i++
//        }

//        val diasDeLaSemana: Array<String>
//
//        diasDeLaSemana = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
//
//        var tamanioDelArreglo = diasDeLaSemana.size
//
//        diasDeLaSemana.set(1, "Jueves")
//
//        println(tamanioDelArreglo)
//
//        for (dia in diasDeLaSemana) {
//            println(dia)
//        }
//
//        for (indice in diasDeLaSemana.indices) {
//            println(indice)
//        }

//        var listaPrueba: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8)

//        println(listaPrueba.size)
//        println(listaPrueba.get(5))
//        println(listaPrueba.first())
//        println(listaPrueba.last())
//        println("Lista inicial: $listaPrueba")
//
//        listaPrueba.add(9)
//        println("Lista con el 9: $listaPrueba")
//
//        listaPrueba.add(0,10)
//        println("Lista con el 10 en el inicio $listaPrueba")
//
//        listaPrueba.removeAt(0)
//        println("Lista eliminando el 10 inicial $listaPrueba")
//
//        listaPrueba.remove(5)
//        println("Lista eliminando el 9 sin importar donde este: $listaPrueba")

//        println(listaPrueba.none()) // Devuelve si la lista esta vacia o no
//        println(listaPrueba.firstOrNull()) // Devuelve el primer valor de la lista si no existe null
//        println(listaPrueba.elementAtOrNull(10)) // Devuelve el valor que se esta buscando en el indice de la lista si no existe null
//        println(listaPrueba.lastOrNull()) // Devuelve el ultimo valor de la lista si no existe null
//
//        listaPrueba.forEach {println(it)}

//        val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1
//        val lowerCase: (String) -> String = { str: String -> str.lowercase() } // 1

//
//        val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2
//
//        val upperCase3 = { str: String -> str.uppercase() }                     // 3
//
//// val upperCase4 = { str -> str.uppercase() }                          // 4
//
//        val upperCase5: (String) -> String = { it.uppercase() }                 // 5
//
//        val upperCase6: (String) -> String = String::uppercase                  // 6

//        println(upperCase1("hello"))
//        println(lowerCase("hello"))
//        println(upperCase3("hello"))
//        println(upperCase5("hello"))
//        println(upperCase6("hello"))

    }

//    fun calculadora(numero1: Float, numero2: Float): Float {
//        val suma = numero1+numero2
//        println("Esta es la suma de los dos valores: $suma")
//        val resta = numero1-numero2
//        println("Esta es la suma de los dos valores: $resta")
//        val multiplicacion = numero1*numero2
//        println("Esta es la suma de los dos valores: $multiplicacion")
//        val divicion = numero1/numero2
//        println("Esta es la suma de los dos valores: $divicion")
//        return suma
//    }
//    fun concatenar(nombre1: String, nombre2: String, apellido1: String, apellido2: String): String {
//        return "$nombre1 $nombre2 $apellido1 $apellido2"
//    }

//}