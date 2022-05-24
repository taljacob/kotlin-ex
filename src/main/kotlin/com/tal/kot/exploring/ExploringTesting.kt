package com.tal.kot.exploring

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.fail
import java.util.*
import kotlin.test.assertEquals

class AgeCalculation() {
    fun getAge(dob: Calendar): Int {
        val today = Calendar.getInstance()
        if(dob.timeInMillis > today.timeInMillis) throw IllegalArgumentException()

        val years = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR)
        return if(dob.get(Calendar.DAY_OF_YEAR) > today.get(Calendar.DAY_OF_YEAR)) years -1 else years

    }
}

class AgeCalculationTests() {

    @Test
    fun checkAgeWhenBornToday() {
        assertEquals(0, AgeCalculation().getAge(Calendar.getInstance()))
    }

    @Test
    fun checkAgeWhen1000DaysAgo() {
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, -1000)
        assertEquals(2, AgeCalculation().getAge(date))
    }

    @Test
    fun testException() {
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, 10)

        Assertions.assertThrows(java.lang.IllegalArgumentException::class.java) {
            AgeCalculation().getAge(date)
        }
    }
}