package com.magixdev.androidmaster.sintaxis

/*
 variables
* */
fun main(){
    name("Gelo")
    lasname("figueroa")
    age(23)
    println(suma(10, 10))

}

// Paquetes de funciones

fun name(nombre:String =""){
    println(nombre)
}
fun lasname(apellido:String = ""){
    println(apellido)
}
fun age(edad:Int = 0){
    println(edad)
}
fun suma(x:Int, y:Int): Int {
    return x + y
}


/* ejemplo
* val name = "Gelo" //variable constante
    var lastName = "Figueroa" //variable mutable

    val age:Int = 23  //variable predefinidas a la mutacion

    //valores String de cadena de texto
    val stringExample:String = "Hela Figueoa Cataldo"

    println("Hola bienvenido a mi nuevo programa $name")
    println("tienes $age y tienes derecho a poder ocuparla, felicidades.")*/