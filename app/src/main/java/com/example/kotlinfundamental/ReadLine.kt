package com.example.kotlinfundamental

fun main(args: Array<String>) {

    print("Enter your first name: ")
    var fName= readLine()
    print("Enter your last name: ")
    var lName= readLine()
    print("Enter your Age: ")
    var age:Int= readLine()!!.toInt()

    print("Your Full name is $fName  $lName And Your Age is $age")

}