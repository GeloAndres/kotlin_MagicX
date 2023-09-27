package com.magixdev.androidmaster.sintaxis

fun main(){
    getMonth(4)
    getMonth2(8)
    getMonth2(10)
}

fun getMonth(mont:Int){
    if(mont == 1){
        println("Enero")
    }else if(mont == 2){
        println("Febrero")
    }else if(mont == 3){
        println("Marzo")
    }else if(mont == 4){
        println("Abril")
    }else if(mont == 5){
        println("Mayo")
    }else if(mont == 6 ){
        println("Junio")
    }
}

fun getMonth2(mont:Int){
    when(mont){
        1 -> println("Enero")
        2 -> println("er")
        3 -> println("rr")
        4 -> println("tre")
        5 -> println("cua")
        6 -> println("cin")
        7 -> println("sei")
        8 -> println("coho")
        9 -> println("nueve")
        10 ->{
            println("creando nuevos rumbos con when")
            println("como saber que este es la segunda linena ?? ")
        }
        in 11..21 -> {
            println("ya te pasaste un pueblo compañero.....")
        }
        else -> println("No es un mes valido")
    }
}