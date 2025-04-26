package com.perez.hector.laboratoriocalificado01

// Función principal para interactuar con el usuario
fun main() {
    // Solicitar al usuario que ingrese una cadena de texto
    println("Ingrese una cadena de texto:")

    // Leemos el texto de la consola (si es nulo, usamos una cadena vacía)
    val texto = readLine() ?: ""

    // Definimos las vocales en minúsculas para hacer la comparación más fácil
    val vocales = "aeiou"

    // Inicializamos una variable contador para llevar el registro de las vocales encontradas
    var contador = 0

    // Convertimos la cadena de texto a minúsculas para no diferenciar entre mayúsculas y minúsculas
    val textoMin = texto.lowercase()

    // Recorremos cada carácter del texto
    for (caracter in textoMin) {
        // Si el carácter es una vocal, incrementamos el contador
        if (caracter in vocales) { contador++ }
    }

    // Mostramos el resultado
    println("La cantidad de vocales es: $contador")
}
