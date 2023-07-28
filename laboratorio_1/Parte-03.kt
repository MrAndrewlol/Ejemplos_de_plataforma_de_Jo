package com.example.laboratorio_parte3



interface  Inota {
    fun mostrar(numero:Int)

}

open class nota(noteagregar: String){

}

class dia(dia_semana: String, noteagregar:String) : nota(noteagregar), Inota{
    init {
        println("Dia de la semana: $dia_semana \n" + "$noteagregar")

    }

    var semana_dia = dia_semana
    var notaagregar = noteagregar


    override fun mostrar(numero:Int){
        println("ID."+(numero+1) +"\n" + semana_dia + "\n" + notaagregar)
    }


}



fun main() {

    var condicion = true
    val listas = arrayListOf<dia>()


    //  FIN     Declaración de variables

    while (condicion == true) {
        println("Bienvenido al Micro To-do list")
        println("que opcion desea realizar")
        println("1.Agregar recordatorio")
        println("2.Quitar recordatorio")
        println("3.Salir")

        var opcion: String = readLine()!!

        if(opcion.toInt() == 1){
            println("Que dia de la semana debe recordarse?")
            var dato: String = readLine()!!
            println("Que es lo que deberia de recordar?")
            var datus: String = readLine()!!

            var agregus = dia(dato, datus)


            listas.add(agregus)
            println("Se ha agregado")







        }
        if(opcion.toInt() == 2){



            var numero: Int = 0
            for(a in listas){
                println(a.mostrar(numero))
                println("\n")
                numero++
            }

            println("Que recordatorio desea quitar?")
            var dato: String = readLine()!!


            listas.removeAt((dato.toInt()-1))
            println("se ha quitado con exito.")

        }

        else if(opcion.toInt() == 3){
            condicion = false

        }

    }
}