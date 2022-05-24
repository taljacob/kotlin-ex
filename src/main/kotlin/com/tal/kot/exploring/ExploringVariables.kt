package com.tal.kot

import java.math.BigDecimal
import kotlin.math.roundToInt

//Some beginners crap
fun main(args: Array<String>) {
    //Kotlin types are inferable
    //The line under the var name indicate it is mutable
    var name = "Tal"
    //val is immutable (as in scala)
    val sName = "Jacob"

    println("Hello $name $sName")
    println("Your first name has ${name.length} ${sName.toUpperCase()}")

    val multiline = """bla bla bla 
        |bla bla bla"""
        .trimMargin()
        .replaceAfterLast("bla", " bli")
    println(multiline)
///////////////////////////////////////////////////////////////////////////////////////////
    //No primitives in kotlin the following will be Double
    val someDouble = 21.4
    //instanceOf
    println("isDouble? ${someDouble is Double}")
    println("kotlin class ${someDouble::class.qualifiedName}")
    println("java class ${someDouble.javaClass}")

    //Int
    val somInteger = someDouble.roundToInt()

    val bd = BigDecimal(17)
    //Late init
    val bd2: BigDecimal

    bd2 = bd.add(BigDecimal(2))
////////////////////////////////////////////////////////////////////////////////////////////

}