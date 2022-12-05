package com.example.kotlinfundamental

import java.sql.SQLOutput

fun main(args: Array<String>) {
    var a= arrayOf(1,2,3)
    println("The First Element = "+a[0])
    println("The Second Element = "+a[1])
    println("The Third Element = "+a[2])
    println("..........................")

    var cars= arrayOf("BMW","Benz","TATA")
    println("The First elements of cars is = "+cars[0])
    println("The Second elements of cars is = "+cars[1])
    println("The Third elements of cars is = "+cars[2])
    println("........................................")
    cars.set(1,"Honda")
    println("The First elements of cars is = "+cars[0])
    println("The Second elements of cars is = "+cars[1])
    println("The Third elements of cars is = "+cars[2])
    println(".....................")
    println("The size of the cars = "+cars.size)
    println(".....................................")

    var carsAndAge= arrayOf("honda",20,"Benz",10)
    println("The First elements of cars is = "+carsAndAge[0])
    println("The Second elements of cars is = "+carsAndAge[1])
    println("The Third elements of cars is = "+carsAndAge[2])
    println("The Forth elements of cars is = "+carsAndAge[3])
}