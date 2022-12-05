package com.example.kotlinfundamental

fun main(args: Array<String>) {

    var age=ArrayList<Int>()
    age.add(5)
    age.add(1,10)
    age.add(2,15)
    age.add(3,20)
    //println("${age}")
    println("The First element of Array is ${age[0]}")
    println("The Second element of Array is ${age[1]}")
    println("The Third element of Array is ${age[2]}")
    println("The Fourth element of Array is ${age[3]}")
    println("..........................................")
    age.remove(20)
    println("The First element of Array is ${age[0]}")
    println("The Second element of Array is ${age[1]}")
    println("The Third element of Array is ${age[2]}")
    println("..........................................")


    var anyElement=ArrayList<Any>()

    anyElement.add("Honda")
    anyElement.add(1,20)
    anyElement.add(2,2.6)
    anyElement.add(3,true)
    anyElement.add(4,false)
    anyElement.add(5,'J')
    println(anyElement)
    println("................................")
    anyElement.remove(true)
    println(anyElement)
}