package ejercicios

fun ejecutarBloque5() {

    // 21. Saludo personalizado
    println(saludar("Karen"))

    // 22. Suma exprés
    println("Suma: ${sumar(5, 3)}")

    // 23 y 24. Parámetro por defecto + argumento nombrado
    crearRectangulo(ancho = 5)

    // 25. Conversor
    println("En pesos: ${convertirADineroLocal(10.0)}")
}


// 21
fun saludar(nombre: String): String {
    return "Hola, $nombre"
}

// 22 (una sola línea)
fun sumar(a: Int, b: Int) = a + b

// 23
fun crearRectangulo(ancho: Int, alto: Int = 10) {
    println("Rectángulo de $ancho x $alto")
}

// 25
fun convertirADineroLocal(dolares: Double): Double {
    val tasa = 4000.0 // ejemplo pesos colombianos
    return dolares * tasa
}