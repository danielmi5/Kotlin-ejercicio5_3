class EntradaCoche {
    companion object{
        fun pedirOpcion(msj: String, numOpciones: Int ) : Int{
            var opcion = -1
            val opciones = crearListaOpciones(numOpciones)
            while (opcion !in opciones){
                opcion = pedirNumero(msj)
                if (opcion !in opciones){
                    println("Opción no válida")
                }
            }
            return opcion
        }
        fun crearListaOpciones(numOpciones: Int): List<Int>{
            val listaOpciones = mutableListOf<Int>()
            for (i in 1..numOpciones){
                listaOpciones.add(i)
            }
            return listaOpciones.toList()
        }
        fun pedirNumero(msj: String): Int {
            var input: Int? = null
            while (input == null) {
                try {
                    print(msj)
                    input = readLine()!!.replace(" ", "").toInt()
                    if (input < 0){
                        input = null
                        println("No puede ser negativo")
                    }
                } catch (e: NumberFormatException) {
                    println("ERROR -> $e")
                }
            }
            return input
        }

        fun pedirKm(opcion: String): Int {
            println("¿Cuanto quieres $opcion?")
            return pedirNumero("Introduce cuanto >> ")
        }

        fun mostrarMenu1(){
            println("¿Quieres arrancar o salir del coche?")
            println("1. Arrancar.\n2. Salir del coche.")
        }

        fun mostrarMenu2(){
            println("¿Quieres acelerar o frenar?")
            println("1. Acelerar.\n2. Frenar.")
        }

        fun mostrarMenu3(){
            println("¿Quieres aparcar o acelerar?")
            println("1. Aparcar.\n2. Acelerar.")
        }
    }
}