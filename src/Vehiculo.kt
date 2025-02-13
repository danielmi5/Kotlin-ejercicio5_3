interface Vehiculo {
    var motorEncendido: Boolean
    var kmHora: Int

    fun acelerar(cantidad : Int){
        if(motorEncendido) {
            kmHora += cantidad
            println("Vehículo acelerado.\nVelocidad actual: $kmHora Km/h")
        } else println("El motor no está encendido.")
    }

    fun frenar(cantidad : Int) {

        if (motorEncendido) {
            val resta = kmHora - cantidad
            if (kmHora == 0){
                println("El vehículo ya está parado.")
            } else if (resta <= 0){
                kmHora = 0
                println("Vehículo frenado.")
            } else {
                kmHora -= cantidad
                println("Vehículo frenado.")
            }
        } else println("El motor no está encendido.")

        println("Velocidad actual: $kmHora Km/h")

    }
}