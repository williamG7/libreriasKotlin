package GestionDeExcepciones

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    try {
        println("Ingrese el primer número:")
        val numero1 = scanner.nextDouble()
        println("Ingrese el segundo número:")
        val numero2 = scanner.nextDouble()

        // Intentar realizar la división
        val resultado = dividirN(numero1, numero2)
        println("El resultado de la división es: $resultado")

    } catch (e: IllegalArgumentException) {
        // Manejar la excepción si el segundo número es cero
        println(e.message)
    } catch (e: Exception) {
        // Manejar cualquier otra excepción
        println("Error: ${e.message}")
    } finally {
        // Este bloque siempre se ejecuta
        println("Fin del programa.")
    }
}

// Función de división que lanza una excepción si el divisor es 0
fun dividirN(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("No se puede dividir por cero.")
    }
    return a / b
}

//Salida esperada (cuando no se divide entre cero):
//
//less
//Copiar
//Editar
//Ingrese el primer número:
//10
//Ingrese el segundo número:
//2
//El resultado de la división es: 5.0
//Fin del programa.
//Salida esperada (cuando se divide entre cero):
//
//less
//Copiar
//Editar
//Ingrese el primer número:
//10
//Ingrese el segundo número:
//0
//No se puede dividir por cero.
//Fin del programa.