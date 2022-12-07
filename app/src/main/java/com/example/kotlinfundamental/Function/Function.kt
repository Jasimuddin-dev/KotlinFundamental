package com.example.kotlinfundamental.Function

fun main(args: Array<String>) {

    print("Enter the first number: ")
    var number1= readLine()!!.toInt()
    print("Enter the second number: ")
    var number2= readLine()!!.toInt()
    show(number1,number2)
    var a= addNumber(number1,number2)
    println("Sum of the two number: $a")
    var b= minimunNumber(number1,number2)
    println("The minimum number : "+b)


}

    fun show(num1:Int,num2:Int){
        println("Show the number1 is $num1 and number2 is $num2")
    }

    fun addNumber(num1:Int,num2:Int):Int{
        var result=0
        result=num1+num2
        return result
    }

    fun minimunNumber(num1:Int,num2:Int):Int{
        var minimum: Int? =null
        if (num1>num2){
            minimum=num2
        }
        else{
            minimum=num1
        }
        return minimum
    }