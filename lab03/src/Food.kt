/*
Universidad del valle de Guatemala
José Rivera 24376
Plataformas móviles

REFERENCIAS:
https://kotlinlang.org/docs/extensions.html#extension-functions
 */

open class Food (val name: String,
                 val price:  Float)
{
     open fun cook() : String= "como cocinar"//Función abstracta
}

//subclase
class Burguer(name: String, price: Float) : Food(name, price) {
    override fun cook(): String {
        return "Paso 1: Sazona la carne.\nPaso 2: Asa la hamburguesa en una parrilla caliente.\nPaso 3: Coloca la carne en un pan con queso, lechuga y tomate.\nPaso 4: Sirve caliente."
    }
}


//subclase
class Pizza(name: String, price: Float) : Food(name, price) {
    override fun cook(): String {
        return "Paso 1: Extiende la masa de pizza.\nPaso 2: Agrega salsa de tomate y queso.\nPaso 3: Añade tus ingredientes favoritos como pepperoni o champiñones.\nPaso 4: Hornea a 220°C durante 15 minutos.\nPaso 5: Corta y sirve caliente."
    }
}

// Función de extensión para Food
fun Food.discountedPrice(descuento: Float): Float {
    val factor = descuento / 100
    return price * (1 - factor)
}


