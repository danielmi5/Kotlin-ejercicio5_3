class Lavadora: DispositivoElectronico, EncendidoApagado {
    override fun encender() {
        println("Encendiendo lavadora...")
    }

    override fun apagar() {
        println("Apagando lavadora...")
    }

    override fun reiniciar() {
        super.reiniciar()
    }
}