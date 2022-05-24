package com.tal.kot.exploring

fun main(args: Array<String>) {

    val colors = listOf("Red", "Green", "Blue") //immutable
    println(colors::class.qualifiedName)
    val days = mutableListOf("Sun", "Mon", "Thu")

    val set = setOf("Jan", "Feb")
    val someMap = mapOf(
        1 to "a",
        2 to "b",
        3 to "c"
    )

    //Arrays in kotlin are always mutable, with fixed size
    val someArray = arrayOf(1, 2, 3, 4, 5)
    someArray[3] = -4
    someArray.forEach { println(it) }
}