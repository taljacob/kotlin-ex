package com.tal.kot.exploring

import com.tal.kot.Ex1.Person

fun main(args: Array<String>) {

    val people = listOf(
        Person(1, "Mr", "Tal", "J", null),
        Person(2, "Ms", "Natash", "J", null),
        Person(3, "Mr", "Niv", "J", null)
    )

    //foreach with distructuring
    for ((id, title, firstName) in people) {
        println("$title $firstName id: $id")
    }
    people.forEach { println(it) }

    val peoplesMap = mapOf(
        Pair(1, Person(1, "Mr", "Tal", "J", null)),
        Pair(2, Person(2, "Ms", "Natash", "J", null)),
        Pair(3, Person(3, "Mr", "Niv", "J", null))
    )

    for ((key, value) in peoplesMap) {
        println("key $key, val $value")
    }
    //ranges
    val rangeObj = 0..9
    for (i in 0..9) {
        println(i)
    }

    (0..9)
        .filter { it % 2 == 0 }
        .map { "some transformation $it" }
        .forEach { println(it) }

    (9 downTo 0).forEach { println(it)}
    (9 until 18).forEach { println(it)}
    (0..9 step 2).forEach { println(it)}
    ('A'..'F').forEach { println(it)}
}