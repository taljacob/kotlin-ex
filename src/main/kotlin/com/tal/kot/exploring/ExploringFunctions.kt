package com.tal.kot

import java.util.function.Function

//Top level functions - In kotlin functions can exist outside classes .
//These are public static by default.

//Kotlin allows nested functions their scope is only inside the top func.

//functions params are immutable ->  val
fun main(args: Array<String>) {
    printAString("Hello World")
    println(addTwoNumbers(17.3, 9.2))
    //passing named parameter
    printSomeMaths(b = 9.2, a = 17.3)
    printSomeMaths(17.3)
}

private fun printAString(value: String) {
    println(value)
}

//A single expression functions (a short hand for the full jav style method, for one op)
//with single expression functions the compiler can infer the return type
fun addTwoNumbers(a: Double, b: Double) = a + b

//b with Default value -> this allows to call this method with passing only the first
fun printSomeMaths(a: Double, b: Double = 3.9) {
    println("a + b is: ${a + b}")
    println("a - b is: ${a - b}")
}

//fun withLambda(input: String, action: Function<String, Int>) {
//    println(action.apply(input))
//}
// the kotlin way:
fun withLambda(input: String, action: (String) -> Int) {
    println(action(input))
}
