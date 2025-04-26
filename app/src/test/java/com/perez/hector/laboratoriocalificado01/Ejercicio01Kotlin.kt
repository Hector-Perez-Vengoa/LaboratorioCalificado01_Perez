package com.perez.hector.laboratoriocalificado01

fun main() {

    // Solicitamos al usuario que ingrese la primera palabra
    println("Ingrese la primera palabra:")

    // Leemos la entrada del usuario y la convertimos a minúsculas.
    // Si no hay entrada, asignamos un string vacío.
    val palabra1 = readLine()?.lowercase() ?: ""

    // Solicitamos al usuario que ingrese la segunda palabra
    println("Ingrese la segunda palabra:")

    // Leemos la entrada del usuario y la convertimos a minúsculas.
    // Si no hay entrada, asignamos un string vacío.
    val palabra2 = readLine()?.lowercase() ?: ""

    // Convertimos ambas palabras en arrays de caracteres, las ordenamos y las comparamos
    if (palabra1.toCharArray().sorted() == palabra2.toCharArray().sorted()){
        // Si las palabras son iguales al ordenarlas, son anagramas
        println("Si son anagramas")
    }else{
        // Si no son iguales, entonces no son anagramas
        println("No son anagramas")
    }
}





