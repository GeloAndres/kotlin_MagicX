package com.magixdev.androidmaster.sintaxis

fun main(){
    //val readOnly:List<String> = listOf("lunes", "martes", "miercoles", "jueves", "Viernes", "sabado", "domingo")
    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("lunes", "martes", "miercoles", "jueves", "Viernes", "sabado", "domingo")
    weekDays.add(0,"GeloDays")
    println(weekDays)

    if(weekDays.isEmpty()){
        //no hay datos dentro de la lista
    }else{
        //asdjlasdk
    }
}