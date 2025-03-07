package GestionDeExcepciones

fun main() {

    // Ejemplo de Manejo de Excepciones

    try {
        val resultado = 10 / 0 // Esto lanzará una ArithmeticException
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}") // Captura y muestra el error
    } finally {
        println("Este bloque siempre se ejecuta.")
    }

    // Crear una función que lanza una excepción personalizada
    try {
        val resultado = dividir(10, 0) // Esto lanzará una IllegalArgumentException
    } catch (e: IllegalArgumentException) {
        println(e.message) // "No se puede dividir por cero"
    }
}

// Función para dividir dos números
fun dividir(a: Int, b: Int): Int {
    if (b == 0) {
        throw IllegalArgumentException("No se puede dividir por cero")
    }
    return a / b
}