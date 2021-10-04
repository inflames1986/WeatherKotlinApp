package com.inflames1986.weatherkotlinapp

class ForCyclesClass {

    val a: Int = 100
    val b: Int = 50

    fun whenTesting(value: String): Int {

        var arifmRes = 1

        when (value) {

            "aaa" -> {
                arifmRes = a + b
            }

            "bbb" -> {
                arifmRes = a - b
            }

            "ccc" -> {
                arifmRes = a * b
            }
        }
        return arifmRes
    }
}