class Lavadora(private val marca: String): EncendidoApagado {
    override fun encender() {
        println("Encendiendo lavadora...")
    }

    override fun apagar() {
        println("Apagando lavadora...")
    }

    override fun toString(): String {
        return "Lavadora(marca = $marca)"
    }
}