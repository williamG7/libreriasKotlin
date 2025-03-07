package colecciones

fun main() {

    // Ejemplo de Colecciones en Kotlin

    // Listas (inmutable y mutable)
    val lista = listOf(1, 2, 3, 4, 5)
    val listaMutable = mutableListOf(1, 2, 3, 4, 5)

    // Operaciones con Listas
    val resultadoLista = lista.filter { it % 2 == 0 } // [2, 4]
    println("Números pares de la lista: $resultadoLista")

    // Sets (inmutable y mutable)
    val set = setOf(1, 2, 2, 3, 4)
    val setMutable = mutableSetOf(1, 2, 3, 4, 5)

    // Operaciones con Sets
    val resultadoSet = set // Elimina duplicados automáticamente
    println("Elementos únicos en el set: $resultadoSet")

    // Map (inmutable y mutable)
    val mapa = mapOf("a" to 1, "b" to 2, "c" to 3)
    val mapaMutable = mutableMapOf("a" to 1, "b" to 2)

    // Operaciones con Mapas
    val valor = mapa["b"] // Obtener el valor asociado a la clave 'b'
    println("Valor asociado a la clave 'b': $valor")
}