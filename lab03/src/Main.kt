/*
Universidad del Valle de Guatemala
José Rivera 24376
Plataformas móviles

REFERENCIAS:
https://chatgpt.com/
*/

fun main() {
    val hamburguesa = Burguer("Big Mac", 42.6F)
    val pizza = Pizza("Bati Pizza", 40.0F)
    val helado = IceCream("Ron con pasas", 12.5F)
    val jugo = Juice("Jugo de naranja", 10.0F)

    var opcion: Int

    do {
        println("\n=== MENÚ ===")
        println("1. Ver cómo se cocina la hamburguesa")
        println("2. Ver cómo se cocina la pizza")
        println("3. Ver cómo se cocina y se come el helado")
        println("4. Ver cómo se cocina el jugo")
        println("5. Aplicar descuento a la hamburguesa")
        println("6. Salir")
        print("Seleccione una opción: ")

        opcion = readLine()?.toIntOrNull() ?: -1

        when (opcion) {
            1 -> {
                println("\nAsí se cocina ${hamburguesa.name}:\n${hamburguesa.cook()}")
            }
            2 -> {
                println("\nAsí se cocina ${pizza.name}:\n${pizza.cook()}")
            }
            3 -> {
                println("\nAsí se cocina ${helado.name}:\n${helado.cook()}")
                println("Y así se come:\n${helado.eat()}")
            }
            4 -> {
                println("\nAsí se cocina ${jugo.name}:\n${jugo.cook()}")
                println("\nAsí se sirve ${jugo.name}:\n${jugo.pour()}")
            }
            5 -> {
                print("\nIngrese el porcentaje de descuento para ${hamburguesa.name}: ")
                val desc = readLine()?.toFloatOrNull()
                if (desc != null) {
                    val precioFinal = hamburguesa.discountedPrice(desc)
                    println("El precio con $desc% de descuento es: Q$precioFinal")
                } else {
                    println("Por favor ingrese un número válido.")
                }
            }
            6 -> println("¡Hasta luego!")
            else -> println("Opción inválida. Intente de nuevo.")
        }

    } while (opcion != 6)
}

