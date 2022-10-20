package com.bladyzamosc.kotlinek.lessons

/**
 * User: Bladyzamosc
 * Date: 20.10.2022
 */
fun main(vararg args: String) {
    kelvin(123)
    kelvin(-500)
    kelvin(10000)
    kelvin(10.0)

    println(conditionAsExpression("A"))
    println(conditionAsExpression("B"))
    println(conditionAsExpression("C"))

    // ternary conditional parameter
    val num = 5
    val a = if (num > 4) "lot" else "few"
    println(a)

    val b = when (num) {
        5 -> "when lot"
        3 -> "when few"
        else -> "default"
    }
    println(b)
}

fun kelvin(temperatureInKelvin: Number) {
    when (temperatureInKelvin) {
        700 -> println("This is Mercury’s max surface temperature")
        0, 1, 2 -> println("This i as cold as it can physically get")
        in 300..699 -> println("This temperature is possible on Mercury")
        !in 0..300 -> println("This is pretty hot")
        is Int -> println("The given temperature is of type Int")
        else -> {
            // Example of a multiline code block
            println("Default case")
        }
    }
}

fun conditionAsExpression(param: String): Number {
    val result = if (param == "A") {
        1
    } else if (param == "B") {
        2
    } else {
        3
    }
    return result
}


