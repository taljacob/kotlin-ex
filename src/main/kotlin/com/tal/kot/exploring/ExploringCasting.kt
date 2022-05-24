package com.tal.kot

import java.math.BigDecimal
import kotlin.random.Random


fun main(args: Array<String>) {

    var result: Any
    val randomNum = Random.nextInt(3)

    result = if (randomNum == 1 )  BigDecimal(30) else  "Hello"
    println("Result is $result")

    result = if(result is BigDecimal) result.add(BigDecimal(20)) else (result as String).toUpperCase()
    println("Result is $result")
}