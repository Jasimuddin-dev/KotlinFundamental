package com.example.kotlinfundamental

fun main(args: Array<String>) {

    var myCharRange='A'.rangeTo('M')
    var myChar='O' in myCharRange
    println("MyCharRange has 'M' : "+myChar)
    myChar='H' in myCharRange
    println("MyCharRange has 'H' : $myChar")
    println("'''''''''''''''''''''''''''''''")

    var myIntRange: IntRange =1.rangeTo(50)
    var myInt=40 in myIntRange
    println("MyIntRange has 40 : $myInt")
    myInt=60 in myIntRange
    println("MyIntRange has 60 : $myInt")

}