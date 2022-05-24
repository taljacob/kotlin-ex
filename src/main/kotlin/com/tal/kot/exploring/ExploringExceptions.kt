package com.tal.kot.exploring

import java.io.FileInputStream
import kotlin.jvm.Throws

@Throws (InterruptedException::class) // This creates a checked for java calls (throws), not for Kotlin
fun dev(a: Int, b: Int): Double {
    Thread.sleep(1000)
    return a.toDouble() / b
}

fun printFile() {
    val input = FileInputStream("file.txt")
    //kotlin try with resources
    input.use {
        // an exception could be thrown here
    }
}

fun main(args: Array<String>) {
    //Kotlin don't have checked exception !!!
    //In Kotlin Try block is an expression
    val result = try {
        dev(5,23)
    } catch (e: Exception) {
        println(e)
        0
    }
    println(result)
}