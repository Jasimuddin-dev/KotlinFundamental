package com.example.kotlinfundamental

fun main(args: Array<String>) {

    var x:Int=5
    var y:Int=8
    var z:Int=12

    var result:Boolean=false
    //Conditional Operator(&&)

    result=(x>y)&&(z>y)
    println("Result: "+result)

    // Conditional Operators(||)

    result=(x>y)||(z>y)
    println("Result: "+result)



}