package com.example.kotlinfundamental

fun main(args: Array<String>) {
    // small value to large value. no data loss
    var a:Byte=127
    var b:Int=a.toInt()
    var c:Double=b.toDouble()
    println(a)
    println(b)
    println(c)

    println(".........................................................")

    // large value to small value. may data loss
    var x:Double=132.98
    var y:Int=x.toInt()
    var z:Byte=y.toByte()
    println(x)
    println(y)
    println(z)
}