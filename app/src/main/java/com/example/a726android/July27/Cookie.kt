package com.example.a726android.July27

import androidx.compose.runtime.currentComposer

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
fun main() {
    val groupedMenu = cookies.groupBy { it.softBaked }
    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu =groupedMenu[false] ?: listOf()
    val totalPrice = cookies.fold(0.0){
        total,cookie -> total+cookie.price
    }
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }
    println("soft cookies:")
    softBakedMenu.forEach{
        println("${it.name}-$${it.price}")
    }
    println("\ncrunchy cookies:")
    crunchyMenu.forEach{
        println("${it.name}-$${it.price}")
    }
    println("\n total price : $${totalPrice}")
    println("\nAlphabetical menu:")
    alphabeticalMenu.forEach{
        println(it.name)
    }
}