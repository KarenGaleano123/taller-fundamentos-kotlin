package ejercicios

  // El opcional

fun ejecutarBloque2() {
    println("=== BLOQUE 2: Null Safety ===")

    val apodo: String? = null
    println("6. Apodo: $apodo")

    // Operador Elvis

    println(apodo ?: "Sin apodo")


    // 8. Llamada segura
    println("Longitud del apodo: ${apodo?.length}")

    // 9. Uso de let
    var correo: String? = "karen@gmail.com"

    correo?.let {
        println("Correo enviado a $it")
    }

    // 10. Aserción no nula (!!)
    var nombre: String? = "Karen"

    println("Longitud del nombre: ${nombre!!.length}")


}
