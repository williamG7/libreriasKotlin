package GestionDeExcepciones

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    try {
        println("Ingrese el primer número:")
        val numero1 = scanner.nextLine().toDouble()

        println("Ingrese el segundo número:")
        val numero2 = scanner.nextLine().toDouble()

        val resultado = dividir(numero1, numero2)
        println("El resultado de la división es: $resultado")

    } catch (e: NumberFormatException) {
        println("Error: Debe ingresar un número válido.")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    } finally {
        println("Fin del programa.")
    }
}

// Función para realizar la división
fun dividir(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("No se puede dividir entre cero.")
    }
    return a / b
}

//Salida esperada (cuando se ingresa un número válido):
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
//Salida esperada (cuando se intenta dividir entre cero):
//
//yaml
//Copiar
//Editar
//Ingrese el primer número:
//10
//Ingrese el segundo número:
//0
//Error: No se puede dividir entre cero.
//Fin del programa.
//Salida esperada (cuando se ingresa un valor no numérico):
//
//less
//Copiar
//Editar
//Ingrese el primer número:
//a
//Error: Debe ingresar un número válido.
//Fin del programa.