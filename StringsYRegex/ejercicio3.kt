package StringsYRegex

fun main() {
    // Expresión regular para validar un correo electrónico
    val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$".toRegex()

    // Expresión regular para validar una contraseña (mínimo 8 caracteres, al menos una letra y un número)
    val passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$".toRegex()

    println("Bienvenido al sistema de registro.")

    // Validación de correo electrónico
    print("Introduce tu correo electrónico: ")
    val email = readLine()!!.trim()
    if (email.matches(emailRegex)) {
        println("Correo electrónico válido.")
    } else {
        println("Correo electrónico inválido. Debe tener el formato correcto (ej. usuario@dominio.com).")
    }

    // Validación de contraseña
    print("Introduce tu contraseña (mínimo 8 caracteres, con al menos una letra y un número): ")
    val password = readLine()!!.trim()
    if (password.matches(passwordRegex)) {
        println("Contraseña válida.")
    } else {
        println("Contraseña inválida. Asegúrate de que tenga al menos 8 caracteres, una letra y un número.")
    }
}
