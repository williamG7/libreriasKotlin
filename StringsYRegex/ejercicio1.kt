package StringsYRegex

import java.util.*
import java.util.regex.Pattern

fun main() {
    val scanner = Scanner(System.`in`)

    println("Ingrese un correo electrónico para validar:")
    val correo = scanner.nextLine()

    // Expresión regular para validar un correo electrónico
    val regex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")

    // Validar el correo
    if (regex.matches(correo)) {
        println("El correo '$correo' es válido.")
    } else {
        println("El correo '$correo' no es válido.")
    }
}

//Salida esperada:
//
//nginx
//Copiar
//Editar
//Ingrese un correo electrónico para validar:
//test@example.com
//El correo 'test@example.com' es válido.
//O si el correo es inválido:
//
//nginx
//Copiar
//Editar
//Ingrese un correo electrónico para validar:
//test@.com
//El correo 'test@.com' no es válido.