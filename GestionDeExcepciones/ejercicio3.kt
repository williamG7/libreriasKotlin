package GestionDeExcepciones

fun main() {
    try {
        println("Calculadora simple")

        // Solicitar primer número
        print("Introduce el primer número: ")
        val num1 = readLine()!!.toDouble()

        // Solicitar segundo número
        print("Introduce el segundo número: ")
        val num2 = readLine()!!.toDouble()

        // Solicitar operación
        print("Introduce la operación (+, -, *, /): ")
        val operacion = readLine()!!

        val resultado = when (operacion) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 == 0.0) {
                    throw ArithmeticException("No se puede dividir entre cero")
                }
                num1 / num2
            }
            else -> throw IllegalArgumentException("Operación no válida")
        }

        println("Resultado: $resultado")
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    } catch (e: NumberFormatException) {
        println("Error: Entrada no válida. Asegúrate de ingresar un número.")
    } catch (e: Exception) {
        println("Error inesperado: ${e.message}")
    } finally {
        println("Operación finalizada.")
    }
}
