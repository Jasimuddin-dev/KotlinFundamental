package com.example.kotlinfundamental.ControlFlowStatement

fun main(args: Array<String>) {

    print("Enter a day number of the week : ")
    var dayNumber:Int= readLine()!!.toInt()
    var myDay:String
    when(dayNumber){
        1-> myDay="Saturday"
        2-> myDay="Sunday"
        3-> myDay="Monday"
        4-> myDay="Tuesday"
        5-> myDay="Wednesday"
        6-> myDay="Thursday"
        7-> myDay="Friday"
        else-> myDay="Invalid day choice"
    }
    println("The day is $myDay")

}