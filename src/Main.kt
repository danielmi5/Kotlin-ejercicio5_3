fun main(){
    val coche = Coche("F1")
    coche.conducir()
    print("Presiona ENTER para continuar...")
    readln()

    val lavadora = Lavadora()
    println()
    lavadora.encender()
    lavadora.apagar()
    lavadora.reiniciar()
    print("Presiona ENTER para continuar...")
    readln()

    val telefono = Telefono()
    println()
    telefono.encender()
    telefono.apagar()
    lavadora.encender()
    lavadora.reiniciar()
}