package com.example.kotlinfundamental

fun main(args: Array<String>) {

    var myArray= arrayListOf<Any>("JAVA",2,2.5,'K',"JAVA")
    println(myArray.size)
    println(myArray.last())
    println(myArray)
    println("................................")
    var mySetArray= setOf<Any>("JAVA",2,2.5,'K',"JAVA")
    println(mySetArray.size)
    println(mySetArray.last())
    println(mySetArray)

}