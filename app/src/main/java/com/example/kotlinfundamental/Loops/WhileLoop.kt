package com.example.kotlinfundamental.Loops

import kotlin.random.Random

fun main(args: Array<String>) {

   /*var x=5
    while (x>0){
        println(x)
        x--
    }

    */

   /* var num=1
    var fact=1
    while (num<5){
        fact *=num
        println("$num! = $fact")
        num++
    }

    */

    var number= Random.nextInt(0,100)
    print("Enter a number: ")
    while (true){

        var userGuess= readLine()!!.toInt()
        if (userGuess==number){
            println("Congratulation, you have guessed the number.")
            break
        }
        else if (userGuess>number){
            println("Decrease the number.")
        }
        else
        {
            println("Increase the number.")
        }


    }


}