package ejercicios

fun ejecutarBloque3() {

    println("=== BLOQUE 3: Condicionales===")
    // 11. Mayoría de edad
    val edad = 18

    if (edad >= 18) {
        println("Puede votar")
    }

    // 12. If como expresión
    val nota = 3.5

    val resultado = if (nota >= 3.0) "Aprobado" else "Reprobado"
    println(resultado)

    // 13. Semáforo con when
    val color = "Rojo"

    when (color) {
        "Rojo" -> println("Pare")
        "Amarillo" -> println("Precaución")
        "Verde" -> println("Siga")
    }

    // 14. Rangos en when
    val temperatura = 20

    when (temperatura) {
        in Int.MIN_VALUE..14 -> println("Frío")
        in 15..25 -> println("Templado")
        else -> println("Calor")
    }

    // 15. Verificación de tipo
    val dato: Any = "Hola"

    when (dato) {
        is String -> println("Es un String")
        is Int -> println("Es un Int")
        else -> println("Otro tipo")
    }
}