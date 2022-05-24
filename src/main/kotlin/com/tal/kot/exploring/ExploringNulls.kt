package com.tal.kot

fun main(args: Array<String>) {
    //kotlin implemented a null safety mechanism

    //null cannot be the value of safe type:
    // var name: String = null

    //nullable type with "?" to get the value of nullable variable also with "?"
    //if its not null kotlin will auto cast it to String
    var name: String? = null

    println(name?.toUpperCase())

    //The "!!" non Null asserted operation will cause the throw of KotlinNullPointer on nullable variables if null

    //when assigning null to an implicit typed param kotlin infers the type Nothing
    //A Nothing cannot be assigned with value
    var nothingVar = null
}