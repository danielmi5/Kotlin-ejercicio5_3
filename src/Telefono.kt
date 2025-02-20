class Telefono(private val marca: String): DispositivoElectronico, EncendidoApagado {
    override fun encender() {
        println("Encendiendo teléfono...")
    }

    override fun apagar() {
        println("Apagando teléfono...")
    }

    override fun toString(): String {
        return "Telefono(marca = $marca)"
    }
}