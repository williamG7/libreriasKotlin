package StringsYRegex

fun main() {

    // Ejemplo de Manipulación de Strings

    val texto = " Kotlin es genial "
    println("Longitud del texto: ${texto.length}") // 19
    println("Texto sin espacios al principio y al final: ${texto.trim()}")
    println("Texto con reemplazo: ${texto.replace("genial", "increíble")}")

    // Expresiones Regulares
    val regex = Regex("^[a-zA-Z0-9]+$") // Solo letras y números
    val textoValido = "abc123"
    val textoInvalido = "abc@123"

    // Verificar si un texto es válido con la regex
    println("¿Texto '$textoValido' es válido? ${regex.matches(textoValido)}") // true
    println("¿Texto '$textoInvalido' es válido? ${regex.matches(textoInvalido)}") // false
}