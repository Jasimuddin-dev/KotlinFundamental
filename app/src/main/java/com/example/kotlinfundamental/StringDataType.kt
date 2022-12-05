package com.example.kotlinfundamental

fun main(args: Array<String>) {
    var a:String="Hello World"
    var b:String="Language"
    println(a+" "+b)
    var age=30
    println(".............................")
    println("Your age = "+age)
    println(".....................")
    var x="Bangla"
    var y=x.length
    println("Length of the word is "+y)
    println("....................")
    var m:Boolean=x.equals("Kotlin")
    println(m)
    println(".....................")
    var p=""
    println(x.isEmpty())
    println(p.isEmpty())
    println("......................")
    println(x.lowercase())
    println(x.uppercase())
    println(".......................")
    var n="   Language    "
    var r=x+n
    println(r)
    var o=x+n.trim()
    println(o)
}