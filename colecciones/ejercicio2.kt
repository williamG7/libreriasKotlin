package colecciones

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("¿Cuántos productos desea ingresar?")
    val numProductos = scanner.nextInt()
    scanner.nextLine()  // Limpiar el buffer

    // Crear las listas para los productos y precios
    val productos = mutableListOf<String>()
    val precios = mutableListOf<Double>()

    // Leer los productos y precios
    for (i in 1..numProductos) {
        println("Ingrese el nombre del producto $i:")
        val producto = scanner.nextLine()
        println("Ingrese el precio de $producto:")
        val precio = scanner.nextDouble()
        scanner.nextLine()  // Limpiar el buffer

        productos.add(producto)
        precios.add(precio)
    }

    // Filtro de productos con precio menor a 50
    val precioFiltro = 50.0
    val productosFiltrados = mutableListOf<String>()
    val preciosFiltrados = mutableListOf<Double>()

    for (i in productos.indices) {
        if (precios[i] < precioFiltro) {
            productosFiltrados.add(productos[i])
            preciosFiltrados.add(precios[i])
        }
    }

    // Mostrar productos filtrados
    println("Productos con precio menor a $precioFiltro:")
    for (producto in productosFiltrados) {
        println(producto)
    }

    // Calcular el total de los productos filtrados
    val total = preciosFiltrados.sum()
    println("El precio total de los productos filtrados es: $total")
}

//Salida esperada:
//yaml
//Copiar
//Editar
//¿Cuántos productos desea ingresar?
//5
//Ingrese el nombre del producto 1:
//Laptop
//Ingrese el precio de Laptop:
//1200
//Ingrese el nombre del producto 2:
//Camiseta
//Ingrese el precio de Camiseta:
//30
//Ingrese el nombre del producto 3:
//Pantalones
//Ingrese el precio de Pantalones:
//40
//Ingrese el nombre del producto 4:
//Zapatos
//Ingrese el precio de Zapatos:
//60
//Ingrese el nombre del producto 5:
//Gorra
//Ingrese el precio de Gorra:
//20
//Productos con precio menor a 50.0:
//Camiseta
//Pantalones
//Gorra
//El precio total de los productos filtrados es: 90.0