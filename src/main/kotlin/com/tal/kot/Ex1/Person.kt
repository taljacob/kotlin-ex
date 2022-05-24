package com.tal.kot.Ex1

import java.util.*

data class Person(val id: Long,
                  val title: String,
                  val firstName: String,
                  val surname: String,
                  val dateOfBirth: Calendar?) {

    override fun toString() = "$title $firstName $surname"

    var favoriteColor: String? = null
    fun getUpperCaseColor(): String {
        //elvis
        return favoriteColor?.toUpperCase() ?: ""
    }

    private fun getLastLetter(a: String) = a.takeLast(1)
    fun getColorLastLetter() {
        //if not null use let to run function else return ""
        //it keyword for  x -> x..
        favoriteColor?.let { getLastLetter(it) } ?: ""
    }

    val safeAge: Int
    //elvis operator for null checks
    get() = age ?: -1

    val age: Int? = getAge(dateOfBirth)

    companion object {
        fun getAge(dateOfBirth: Calendar?): Int? {
            if(dateOfBirth == null) return null

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if(dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years - 1
                    else years
        }
    }
    // in Kotlin == is java's equals()
    //where as === is java's reference equality (==)

    fun getColorType(): String {
        return when(getUpperCaseColor()) {
            "" -> "Empty"
            "RED", "GREEN", "BLUE" -> "rgb"
            else -> "Other"
        }
    }
}

fun main(args: Array<String>) {
    val jhon = Person(1L, "Mr", "John", "blue", GregorianCalendar(1977,9,3))
    val jane = Person(2L, "Ms", "Jane", "green", null)

    println("$jhon's age is ${jhon.age}")
    println("$jane's age is ${jane.age}")
}