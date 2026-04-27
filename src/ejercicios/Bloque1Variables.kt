package ejercicios

fun ejecutarBloque1() {

    println("=== BLOQUE 1: VARIABLES ===")

    // Perfil de usuario - Ejercicio1

    val nombre = "Karen"
    var ciudad = "Medellín"

    println("Nombre: $nombre")
    println("Ciudad: $ciudad")

    ciudad = "Barcelona"

    println("Nueva ciudad: $ciudad")


    println("=== Ejercicio 2 ===")

// Calculadora de años

    val anioNacimiento = 2008
    val anioActual = 2026

    val edad = anioActual - anioNacimiento

    println("Año de nacimiento: $anioNacimiento")
    println("Edad aproximada: $edad")

    println("=== Ejercicio 3 ===")

    // Ejercicio 3 (Tipos explícitos)

    val precioCoche: Double = 45000.99
    val pesoNaranja: Float = 0.25f
    val poblacion: Long = 8000000000

    println(precioCoche)
    println(pesoNaranja)
    println(poblacion)


    // Inferencia


        val estaLloviendo = true

        println("¿Está lloviendo? $estaLloviendo")



    fun main() {
        println("Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")
    }
}

//Constantes Reales
object Constants {
    const val VELOCIDAD_LUZ = 299792458
}



//


