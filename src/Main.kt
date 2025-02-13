fun main(){
    val coche = Coche("F1")
    coche.conducir()
    print("Presiona ENTER para continuar...")
    readln()

    val lavadora = Lavadora("Bosch")
    println()
    lavadora.encender()
    lavadora.apagar()
    print("Presiona ENTER para continuar...")
    readln()

    val telefono = Telefono("Nokia")
    println()
    telefono.encender()
    telefono.reiniciar()
    telefono.apagar()

}