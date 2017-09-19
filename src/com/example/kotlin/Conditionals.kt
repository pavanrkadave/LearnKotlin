package com.example.kotlin

fun main(args : Array<String>){

    //inline conditional statement

    var myChar : Char = 'A'
    println("A is a Char : ${myChar is Char} " )

    //typecasting
    println("Converting the Float (3.147) to Int :  ${3.14.toInt()}")
    println("Converting the Float (3.147) to Char :  ${3.147.toChar()}")


}

