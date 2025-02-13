class Telefono: DispositivoElectronico, EncendidoApagado {
    override fun encender() {
        println("Encendiendo teléfono...")
    }

    override fun apagar() {
        println("Apagando teléfono...")
    }

    override fun reiniciar() {
        super.reiniciar()
    }
}