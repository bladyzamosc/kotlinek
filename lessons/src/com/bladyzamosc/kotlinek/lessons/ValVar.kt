package com.bladyzamosc.kotlinek.lessons

/**
 * User: Bladyzamosc
 * Date: 18.10.2022
 */
fun main(vararg args: String) {
    var number = 17
    println("number = $number")
    number = 42  // var can be reassigned
    println("number = $number")

    val byte: Byte = 127
    val short: Short = 32767
    val int: Int = 2147483647
    val long: Long = 9223372036854775807

    println(byte)
    println(short)
    println(int)
    println(long)

    val float: Float = 3.4028235e38f
    val double: Double = 1.7976931348623157e308

    println(float)
    println(double)

    val character: Char = '#'
    val text: String = "Learning about Kotlin's data types"
    val multiline: String = """Learning about Kotlin's data types
        multiline""".trimMargin()

    println(character)
    println(text)
    println(multiline)

    val yes: Boolean = true
    val no: Boolean = false

    println(yes)
    println(no)
}


