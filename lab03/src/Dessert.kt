interface Dessert {
    fun eat(): String
}

class IceCream(name: String, price: Float): Dessert, Food(name, price){

    override fun eat(): String {
        return "Comer mientras está frío, no dejes que se derrita y cometelo felíz"
    }

    override fun cook(): String {
        return "Paso 1: Mezcla crema, leche, azúcar y vainilla.\nPaso 2: Vierte la mezcla en una máquina para hacer helado.\nPaso 3: Congela hasta que adquiera una textura cremosa.\nPaso 4: Sirve en un cono o vaso."
    }
}