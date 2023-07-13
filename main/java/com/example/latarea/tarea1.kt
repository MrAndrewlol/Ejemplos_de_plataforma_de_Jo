package com.example.latarea


class Contactus {

    var listacontacto = ArrayList<Contactus>()
    var nombre:String= ""
    var telefono:String = ""
    var correo:String = ""
    val titulos = arrayOf("nombre","numero de telefono", "correo electronico")


    fun agregarcontacto() {

        for (x in titulos){
            println("Ingresar el" + x +  "de la persona")
            nombre = readLine()!!
        }

    }

    fun paraString() {
        println("Nombre: " + nombre + "\nNumero de Telefono:" + telefono + "\nCorreo electronico" + correo)
    }


}
fun main(){

    var nuevocontacto = Contactus()
    var listacontacto = ArrayList<Contactus>()

    var contraseña: String = "1234"


    println("Bienvenido por favor Ingresar su usuario y contraseña")

    var usuario: String = readLine()!!
    var verificar: String = readLine()!!
    var opcion:String = "0"





    if (contraseña == verificar){

        println("Bienvenido querido " + usuario)

        while (opcion == "4") {
            println("Que opcion desea realizar? \n1.Agregar contacto \n2.Eliminar contacto \n3.Mostrar un contacto \n4Salir")

            opcion = readLine()!!

            if (opcion == "1") {
                nuevocontacto.agregarcontacto()
                listacontacto.add(nuevocontacto)
            }

            if (opcion == "2") {
                println("Mostrando todos los contactos")
                var repeticc = 0
                while (repeticc < listacontacto.size) {
                    println("." + repeticc + 1 + "." + listacontacto[repeticc].paraString())
                    repeticc = +1
                }

                println("Que contacto desea eliminar?")
                var deletecon: String = readLine()!!
                listacontacto.removeAt((deletecon.toInt() - 1))

            }
            if (opcion == "3") {

                println("Mostrando todos los contactos")
                var repeticc = 0
                while (repeticc < listacontacto.size) {
                    println("." + repeticc + 1 + "." + listacontacto[repeticc].paraString())
                    repeticc = +1
                }

            } else {
                println("Se ha salido que le vaya bien")
            }
        }



    }

}