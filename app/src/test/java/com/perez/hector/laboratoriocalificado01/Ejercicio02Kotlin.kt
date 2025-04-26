package com.perez.hector.laboratoriocalificado01

fun contarVocales(texto: String): Int {
    // Definimos las vocales en minúsculas para hacer la comparación más fácil
    val vocales = "aeiou"

    // Inicializamos una variable contador para llevar el registro de las vocales encontradas
    var contador = 0

    // Convertimos la cadena de texto a minúsculas para no diferenciar entre mayúsculas y minúsculas
    val textoMin = texto.lowercase()

    // Recorremos cada carácter del texto
    for (caracter in textoMin) {
        // Si el carácter es una vocal, incrementamos el contador
        if (caracter in vocales) {
            contador++
        }
    }

    // Devolvemos el número total de vocales encontradas
    return contador
}

// Función principal para interactuar con el usuario
fun main() {
    // Solicitar al usuario que ingrese una cadena de texto
    println("Ingrese una cadena de texto:")
    val texto = readLine() ?: ""  // Leemos el texto de la consola (si es nulo, usamos una cadena vacía)

    // Llamamos a la función para contar las vocales en el texto
    val cantidadVocales = contarVocales(texto)

    // Mostramos el resultado
    println("La cantidad de vocales es: $cantidadVocales")
}
