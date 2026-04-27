package ejercicios

fun ejecutarBloque4() {

    // 16. Conteo simple
    for (i in 1..10) {
        println(i)
    }

    // 17. Cuenta regresiva
    for (i in 10 downTo 1) {
        println(i)
    }

    // 18. Saltos de 3
    for (i in 1..20 step 3) {
        println(i)
    }

    // 19. While (casi infinito)
    var energia = 5

    while (energia > 0) {
        println("Energía: $energia")
        energia--
    }

    // 20. Do-While
    var contraseña: String

    do {
        println("Ingrese contraseña:")
        contraseña = "1234" // simulación
    } while (contraseña != "1234")

    println("Acceso permitido")
}
