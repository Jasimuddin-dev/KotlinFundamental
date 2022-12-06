package com.example.kotlinfundamental.ControlFlowStatement

fun main(args: Array<String>) {

    print("Enter your age : ")
    var age:Int= readLine()!!.toInt()
    if (age<13){
        print("You are a child.")
    }
    else if (age<19){
        print("You are a teenager.")
    }
    else if (age<40){
        print("you are adult.")
    }
    else{
        if (age<50) {
            print("you are middle aged adult.")
        }
        else {
            print("You are old.")
        }
    }
}