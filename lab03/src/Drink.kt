
abstract class Drink(name: String, price: Float ): Food(name,price) {
    abstract fun pour(): String
}

//subclase
class Juice(name: String, price: Float) : Drink(name, price) {


    override fun cook(): String {
        return "Paso 1: Lava bien las frutas.\nPaso 2: Córtalas en trozos pequeños.\nPaso 3: Coloca las frutas en una licuadora o exprimidor.\nPaso 4: Cuela si es necesario y sirve frío."

    }

    override fun pour(): String {
        return "sirve frio, caliente o al tiempo, lo importante es que le guste al cliente. "
    }
}