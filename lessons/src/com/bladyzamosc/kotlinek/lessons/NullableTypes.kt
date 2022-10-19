package com.bladyzamosc.kotlinek.lessons

/**
 * User: Bladyzamosc
 * Date: 19.10.2022
 */
fun main(vararg args: String) {
    // val input: String = null - going to give 'error: null can not be a value of a non-null type String'
    val nullableString : String? = null
    println(nullableString)
    // nullableType.toUInt() - gives compiler error
    val nullableInt = nullableString?.toInt();
    println(nullableInt)
    // elvis operator
    val elvis = nullableString ?: "Elvis"
    println(elvis)
    // nullableString!!.toInt() - kotlin.KotlinNullPointerException
}


