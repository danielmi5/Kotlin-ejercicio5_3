fun main(){
    val coche = Coche("F1")
    println(coche)
    coche.conducir()
    print("Presiona ENTER para continuar...")
    readln()

    val lavadora = Lavadora("Bosch")
    println("\n$lavadora")
    lavadora.encender()
    lavadora.apagar()
    print("Presiona ENTER para continuar...")
    readln()

    val telefono = Telefono("Nokia")
    println("\n$telefono")
    telefono.encender()
    telefono.reiniciar()
    telefono.apagar()

}