package com.magixdev.androidmaster.sintaxis

fun main(){
    ifBasico("Daniela")
}

fun ifBasico(name:String){
    val name:String = name

    if(name == "Pepe"){
        //body
        println("ahora estamos adentro del if, como en todo los lenguajes.....")
    }
    else if(name == "Daniela"){
        println("Parece que quieres saber el chisme....")
    }
    else{
        println("No te llama Pepe jajajajj XD")
        println("tu nombre es $name")
    }
}