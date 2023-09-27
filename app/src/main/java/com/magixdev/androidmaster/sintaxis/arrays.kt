package com.magixdev.androidmaster.sintaxis

fun main(){
    var weekDays = arrayOf("lunes", "martes", "miercoles", "jueves", "Viernes", "sabado", "domingo")

    var cant:Int = weekDays.size

    //blucles para arrays

    for(position in weekDays.indices){
        print("He pasado por aqui $position ")
        println(weekDays[position])
    }
}