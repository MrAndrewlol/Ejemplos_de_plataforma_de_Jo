package com.example.laboratorio01


class ItemDAta{


    var originalPos: Int= 0
    var originalvalue: Any? = null
    var type: Any? = null
    var infos: Any? = null
    var milista = listOf( 5, "Hola", true, null)

    fun mostrarlista(){
        if(milista == null ){
            println("la lista es null")
        }
        else{
            println("la lista es la siguiente")
            for(a in milista){
                println(a)
            }
        }
        println("\n\n")
    }



    fun processlist(){
        var b: Int = 0

       for (a in milista){
           originalvalue = a

           println("valor original: " + originalvalue.toString())
           if (a is String){
               println("Tipo de dato es cadena")
               type = "cadena"
               infos = "L"+(a.length)
               println("La informacion basica es: " + infos)
           }
           if (a is Int){
               println("Tipo de dato es entero")
               type = "entero"
               var falsificador: Boolean = true
                b = 2
               while (falsificador == true){
                   var comprobar = a%b
                   b++
                   if (comprobar == 0){
                       infos = "M" + b
                       falsificador = false

                   }
               }
               println("La informacion basica es: " + infos)
           }
           if (a is Boolean){
               println("Tipo de dato es booleano")
               type = "boolean"
               if(a == true){
                   infos = "Verdadero"

               }
               if(a == false){
                    infos = "Falso"
               }
               println("La informacion basica es: " + infos)
           }
           else if (a == null){
               println("El dato es null")
               type = null
               infos = "Null"
               println("La informacion basica es: " + infos)
           }
           println("\n")

       }
    }
}


fun main(){
//Empezamos con las supervariable asi que ojo :)

    var nuevoproceso = ItemDAta()
    // Everything after this is in red
    val red = "\u001b[31m"
    val magenta = "\u001b[35m"
// Resets previous color codes
    val reset = "\u001b[0m"

    //Declaro las variables *ElFINISH*

    var siuu: Boolean = true

    //nuevoproceso.originalPos = valor.toInt()



    while (siuu == true) {
        println( magenta + "Bienvenido al data manager")
        println("Que opcion desea realizar?")
        println("1.Mostrar todos los datos\n2.salir (SIUUUU)" + reset)
        var opcion: String = readLine()!!

        println(red + "\n\nTomar Nota Solo hay 4 Espacios " + reset)


        if (opcion.toInt() == 1) { //Mostrar todos los datos

            nuevoproceso.mostrarlista()

            nuevoproceso.processlist()

            println("\n\nSe ha mostrado todos los datos" )
        }
        else if(opcion.toInt() == 2) {
            println("Se salio Siuu")
            siuu = false
        }

    }






}