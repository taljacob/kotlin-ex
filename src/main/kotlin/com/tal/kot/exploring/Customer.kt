package com.tal.kot

//using the keyword data we also get a toString ,equals and hashcode, copy
data class Customer(val name: String,
               val address: String,
               var age: Int) {

    constructor(name: String, age: Int): this(name, "", age)
}

class AlternativeCustomer(val name: String, var age: Int) {
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int): this(name, age) {
        this.address = address
    }
}

//cleaner
class AnotherCustomer(val name: String, var age: Int, val address: String = "") {
    var approved: Boolean = false
    //overriding the default setter with set after the field declaration, and using the keyword "field"
    set(value) {
        if (age > 21) {
            field = value
        } else {
            println("Not Approved: under 21")
        }
    }

    val nextAge
    get() = age + 1

    fun upperCaseName() = name.toUpperCase()
    //overriding functions using the override keyword
    override fun toString() =  "$name $address $age"
    //any function inside this block will be static
    companion object {
        fun getInstance() = AnotherCustomer("Mick", 22, "bla bla")
    }
}

fun main(args: Array<String>) {
    val customer = Customer("Tal", "Some address", 28)
    val customer2 = AnotherCustomer("John", 19)

    println("${customer.name} is ${customer.age} yers old")
    println("${customer2.name} is ${customer2.age} yers old")
    customer2.approved = true
    println(customer2.nextAge)
    println(customer2.upperCaseName())

    val customer3 = AnotherCustomer.getInstance()
    println(customer3)

    val customer4 = Customer("Sally", 29)
    val customer5 = customer4.copy(name = "Diane")
    println(customer5)
    //destructuring from data class
    val (name, address, age) = customer5
    println(address)
}