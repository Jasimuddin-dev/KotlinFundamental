package com.example.kotlinfundamental.ControlFlowStatement

fun main(args: Array<String>) {

    print("Enter 3 numbers: ")
    var num1= readLine()!!.toInt()
    var num2= readLine()!!.toInt()
    var num3= readLine()!!.toInt()
    if (num1>num2){
        if (num1>num3){
            print("the largest number is $num1")
        }
        else{
            print("The Largest number is $num3")
        }
    }
    else{
        if (num2>num3){
            print("the largest number is $num2")
        }
        else{
            print("the largest number is $num3")
        }
    }

}