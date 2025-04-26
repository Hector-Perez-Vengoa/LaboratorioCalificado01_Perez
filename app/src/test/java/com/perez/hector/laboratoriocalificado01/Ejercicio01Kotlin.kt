package com.perez.hector.laboratoriocalificado01


// Función que verifica si dos palabras son anagramas
fun esAnagrama(p1: String, p2: String): Boolean {
    // Si las longitudes son diferentes, no pueden ser anagramas
    if (p1.length != p2.length) {
        return false
    }
    // Convertimos ambas palabras a arrays de caracteres, las ordenamos y comparamos
    return p1.toCharArray().sorted() == p2.toCharArray().sorted()
}

// Función para realizar las pruebas de anagramas

// Función principal que permite la ejecución del programa
fun main() {
    // Solicitamos al usuario que ingrese las palabras
    println("Ingrese la primera palabra:")
    val palabra1 = readLine()?.lowercase() ?: ""

    println("Ingrese la segunda palabra:")
    val palabra2 = readLine()?.lowercase() ?: ""

    // Verificamos si son anagramas y mostramos el resultado
    val resultado = esAnagrama(palabra1, palabra2)
    println("¿Son anagramas?: $resultado")
}




