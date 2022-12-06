package com.example.kotlinfundamental.Loops

fun main(args: Array<String>) {

   /* for (number in 1..10){
        println(number)
    }
    */
    /*var sum=0
    for (x in 1..10){
        println(x)
        sum +=x
    }
    println("Sum of the series: "+sum)

     */
    /*var sum=0
    for (x in 1..10){
        if (x % 2==0){
            println(x)
            sum +=x
        }
    }
    println("Sum of the even numnber: "+sum)

     */

   /* var sum=0
    for (x in 1..15){
        if (x %2!=0){
            println(x)
            sum +=x
        }
    }
    print("Sum of the odd number: $sum")

    */

   /* var myArray= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (x in myArray){
        println(x)
    }

    */

  /*  val myArray= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (x in 0 until (myArray.size)){
        println("myArray[$x]= ${myArray[x]}")
    }

   */

   /* val myArray= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (x in myArray.indices){
        println("myArray[$x]= ${myArray[x]}")
    }

    */

    val myArray= arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    myArray.forEach {
        println(it)
    }

}