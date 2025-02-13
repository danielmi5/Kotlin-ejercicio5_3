class Coche(
    var marca: String,


): Vehiculo, EncendidoApagado {
    override var motorEncendido: Boolean = false
    override var kmHora: Int = 0

    override fun encender() {
        motorEncendido = true
        println("Coche arrancado")
    }

    override fun apagar() {
        motorEncendido = false
        println("Coche apagado")
    }

    private fun quiereArrancar(): Boolean{
        EntradaCoche.mostrarMenu1()
        val opcion = EntradaCoche.pedirOpcion("Introduce la opción >> ", 2)
        return if (opcion == 1) true else false
    }
    private fun quiereAparcar(): Boolean{
        EntradaCoche.mostrarMenu3()
        val opcion = EntradaCoche.pedirOpcion("Introduce la opción >> ", 2)
        return if (opcion == 1) true else false
    }

    fun conducir(){
        var salirCoche = false
        while (!salirCoche) {
            if (!motorEncendido) {
                if (quiereArrancar()) encender() else salirCoche = true
            }

            if (motorEncendido) {
                EntradaCoche.mostrarMenu2()
                val opcion  = EntradaCoche.pedirOpcion("Introduce la opción >> ", 2)
                if (opcion == 1) acelerar(EntradaCoche.pedirKm("acelerar")) else frenar(EntradaCoche.pedirKm("frenar"))

                if (kmHora == 0) {
                    println("Estás en medio de la carretera, ¿Quieres aparcar?")
                    if (quiereAparcar()) apagar() else acelerar(EntradaCoche.pedirKm("acelerar"))
                }
            }
        }
        println("Saliendo del coche...")
    }
}