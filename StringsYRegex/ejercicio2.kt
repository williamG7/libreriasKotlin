package StringsYRegex

import java.util.*
import java.util.regex.Pattern

fun main() {
    val scanner = Scanner(System.`in`)

    println("Ingrese un número de teléfono en el formato (XXX) XXX-XXXX:")
    val telefono = scanner.nextLine()

    // Expresión regular para validar el teléfono
    val regex = Regex("^\\(\\d{3}\\) \\d{3}-\\d{4}$")

    // Validar el teléfono
    if (regex.matches(telefono)) {
        println("El número '$telefono' es válido.")
    } else {
        println("El número '$telefono' no es válido.")
    }
}

//Salida esperada (cuando es válido):
//java
//Copiar
//Editar
//Ingrese un número de teléfono en el formato (XXX) XXX-XXXX:
//(123) 456-7890
//El número '(123) 456-7890' es válido.
//Salida esperada (cuando no es válido):
//
//nginx
//Copiar
//Editar
//Ingrese un número de teléfono en el formato (XXX) XXX-XXXX:
//123-456-7890
//El número '123-456-7890' no es válido.