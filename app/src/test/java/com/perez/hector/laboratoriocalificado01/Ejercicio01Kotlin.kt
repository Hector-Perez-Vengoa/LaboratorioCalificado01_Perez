package com.perez.hector.laboratoriocalificado01

import org.junit.Test

class Ejercicio01Kotlin {

    // lateinit sirve para solo declarar e inicializar posteriormente
    private lateinit var n7: String

    @Test
    // Importamos la función readLine para poder leer entrada desde la consola (esto viene por defecto)
    fun main() {
        // Solicitamos al usuario que ingrese la primera palabra
        println("Ingrese la primera palabra:")
        val palabra1 = readLine()!!.lowercase() // Leemos la primera palabra y la convertimos a minúscula

        // Solicitamos al usuario que ingrese la segunda palabra
        println("Ingrese la segunda palabra:")
        val palabra2 = readLine()!!.lowercase() // Leemos la segunda palabra y la convertimos a minúscula

        // Llamamos a la función esAnagrama enviando las dos palabras ingresadas
        val resultado = esAnagrama(palabra1, palabra2)

        // Mostramos el resultado en consola
        println("¿Son anagramas?: $resultado")
    }

    // Función que verifica si dos palabras son anagramas
    fun esAnagrama(p1: String, p2: String): Boolean {
        // Comparamos las longitudes primero: si son diferentes, no pueden ser anagramas
        if (p1.length != p2.length) {
            return false
        }

        // Convertimos ambas palabras a listas de caracteres, las ordenamos y las comparamos
        return p1.toCharArray().sorted() == p2.toCharArray().sorted()

        /* Explicación:
           - toCharArray() convierte el texto en un array de caracteres.
           - sorted() ordena esos caracteres alfabéticamente.
           - Si las listas ordenadas son iguales, entonces son anagramas.
        */
    }
}


