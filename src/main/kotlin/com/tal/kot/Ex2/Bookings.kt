package com.tal.kot.Ex2

import com.sun.tools.corba.se.idl.constExpr.BooleanNot
import java.math.BigDecimal

interface BookingManager {
    val version: String

    fun isSeatFree(seat: Seat): Boolean
    fun reserveSeat(seat: Seat, customerId: Long): Boolean
    //default implementation
    fun systemStatus() = "All ops functional"
}

class UnAuthorizedUserException: Throwable()

//open class allows inheritance
open class BasicBookingManager(authKey: String): BookingManager {
    override val version = "1.0"

    override fun isSeatFree(seat: Seat) = true
    override fun reserveSeat(seat: Seat, customerId: Long) = false

    init {
        if(authKey != "12345") throw UnAuthorizedUserException()
    }
}

class AdvancedBookingManager: BasicBookingManager("12345"), java.io.Closeable {
    override val version = "2.0"

    fun bookingsCount() = 10
    override fun close() {}
}

//adding function to closed classes
fun String.toSentenceCase(): String {
    return this[0].toUpperCase() + this.substring(1)
}

fun main(args: Array<String>) {
    println(AdvancedBookingManager().isSeatFree(Seat(1,1, BigDecimal.ZERO, "")))

    val myList = mutableListOf<Int>()

    val greeting = "welcome to the system"
    println(greeting.toSentenceCase())
}