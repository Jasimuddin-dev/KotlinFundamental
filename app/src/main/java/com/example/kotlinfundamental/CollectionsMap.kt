package com.example.kotlinfundamental

fun main(args: Array<String>) {

    //Immutable
    var age= mapOf<String,Int>("Asad" to 23,"Jasim" to 29)

    println("Asad age is "+age["Asad"])
    println("Jasim age is "+age["Jasim"])
    println("..............................")

    var mutableAge= mutableMapOf<String,Int>("Asad" to 23,"Jasim" to 29)
    mutableAge.put("Abir",35)
    println("Asad age is "+mutableAge["Asad"])
    println("Jasim age is "+mutableAge["Jasim"])
    println("Abir age is "+mutableAge["Abir"])

}