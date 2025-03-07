package colecciones

fun main() {
    // Lista inmutable de productos disponibles en la tienda
    val productosDisponibles: List<String> = listOf("Manzana", "Banana", "Cereza", "Pera", "Uva")

    // Mapa mutable que almacena el precio de cada producto
    val precios: MutableMap<String, Double> = mutableMapOf(
        "Manzana" to 0.5,
        "Banana" to 0.3,
        "Cereza" to 1.2,
        "Pera" to 0.6,
        "Uva" to 1.5
    )

    // Set mutable que almacena las compras realizadas por un cliente (sin duplicados)
    val comprasCliente: MutableSet<String> = mutableSetOf()

    println("Bienvenido a la tienda. Estos son los productos disponibles: $productosDisponibles")

    // Simulamos una compra
    println("¿Qué productos te gustaría comprar? (Introduce 'fin' para terminar):")
    var productoComprado: String
    while (true) {
        productoComprado = readLine()!!.trim()
        if (productoComprado == "fin") {
            break
        }
        if (productosDisponibles.contains(productoComprado)) {
            comprasCliente.add(productoComprado)
            println("Producto '$productoComprado' agregado a tus compras.")
        } else {
            println("El producto '$productoComprado' no está disponible.")
        }
    }

    // Mostramos el resumen de la compra
    println("\nResumen de la compra:")
    var total = 0.0
    for (producto in comprasCliente) {
        val precio = precios[producto] ?: 0.0
        println("$producto - Precio: \$${precio}")
        total += precio
    }

    println("\nTotal de la compra: \$${total}")
}
