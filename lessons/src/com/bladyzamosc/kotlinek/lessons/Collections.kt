package com.bladyzamosc.kotlinek.lessons

/**
 * User: Bladyzamosc
 * Date: 22.10.2022
 */
fun main(vararg args: String) {

    createLisys()
    sets()
    arrays()
    maps()
}

fun maps() {
    val map = mapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3
    )

    val mapPair = mapOf(
        Pair("a", 1),
        Pair("b", 2),
        Pair("c", 3),
    )
}

fun arrays() {
    val array = arrayOf("a", "b")
    println(array[1])
}

fun sets() {
    val readonlySet = setOf("A", "A", "B")
    val hashSetOf = hashSetOf("A", "A", "B")
    val linkedSetOf = linkedSetOf("A", "A", "B")
    val sortedSetOf = sortedSetOf("A", "A", "B")
    val mutableSet = mutableSetOf("A", "A", "B")

    mutableSet.add("C")
    mutableSet.remove("B")
    println(mutableSet)
}

fun createLisys() {
    val siUnits = listOf("a", "b", "c", "d", "e", "f", "g")                   // Creates readonly list
    val quarks = mutableListOf("1", "2", "3", "4", "5", "6") // Creates mutable list
    val physicists = arrayListOf("AB", "CD")

    println(siUnits[3])
    println(quarks[3])

    quarks[3] = "dd"
    println(quarks[3])
}




