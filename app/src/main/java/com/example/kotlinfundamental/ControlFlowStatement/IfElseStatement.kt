package com.example.kotlinfundamental.ControlFlowStatement

fun main(args: Array<String>) {

    print("Enter a Number: ")
    var num: Int = readLine()!!.toInt()
    if (num % 2 ==0){
        print("The number $num is even")
    }
    else{
        print("The numner $num is Odd.")
    }
}