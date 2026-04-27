package ejercicios

fun ejecutarBloque6()  {

    // 26. Lista de compras
    val compras = mutableListOf("Arroz", "Leche", "Pan")

    compras.add("Huevos")     // añadir
    compras.removeAt(1)       // eliminar segundo elemento

    println(compras)

    // 27. Filtro de precios
    val precios = listOf(20, 60, 45, 80, 30)

    val baratos = precios.filter { it < 50 }

    println("Menores a 50: $baratos")

    // 28. Buscador
    val amigos = listOf("Ana", "Luis", "Andrea", "Carlos")

    val encontrado = amigos.find { it.startsWith("A") }

    println("Encontrado: $encontrado")

    // 29. Extensión Int
    val numero = -5
    println("¿Es negativo? ${numero.esNegativo()}")

    // 30. Extensión String
    val texto = "Hola mundo Kotlin"
    println(texto.quitarEspacios())
}


// 29
fun Int.esNegativo(): Boolean {
    return this < 0
}

// 30
fun String.quitarEspacios(): String {
    return this.replace(" ", "")
}