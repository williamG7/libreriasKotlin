package colecciones

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val estudiantes = mutableListOf<String>()
    val calificaciones = mutableListOf<Double>()

    // Leer 5 estudiantes y sus calificaciones
    for (i in 1..5) {
        println("Ingrese el nombre del estudiante $i:")
        val nombre = scanner.nextLine()
        println("Ingrese la calificación de $nombre:")
        val calificacion = scanner.nextDouble()
        scanner.nextLine()  // Limpiar el buffer

        estudiantes.add(nombre)
        calificaciones.add(calificacion)
    }

    // Filtrar estudiantes con calificación mayor a 5
    val estudiantesAprobados = mutableListOf<String>()
    for (i in estudiantes.indices) {
        if (calificaciones[i] > 5) {
            estudiantesAprobados.add(estudiantes[i])
        }
    }

    println("Estudiantes aprobados: ${estudiantesAprobados.joinToString(", ")}")

    // Calcular el promedio de las calificaciones
    val promedio = calificaciones.average()
    println("El promedio de calificaciones es: $promedio")
}

//Salida esperada:
//
//yaml
//Copiar
//Editar
//Ingrese el nombre del estudiante 1:
//Juan
//Ingrese la calificación de Juan:
//6.5
//Ingrese el nombre del estudiante 2:
//Ana
//Ingrese la calificación de Ana:
//4.0
//Ingrese el nombre del estudiante 3:
//Luis
//Ingrese la calificación de Luis:
//7.2
//Ingrese el nombre del estudiante 4:
//Carlos
//Ingrese la calificación de Carlos:
//5.8
//Ingrese el nombre del estudiante 5:
//María
//Ingrese la calificación de María:
//8.1
//Estudiantes aprobados: Juan, Luis, Carlos, María
//El promedio de calificaciones es: 6.12