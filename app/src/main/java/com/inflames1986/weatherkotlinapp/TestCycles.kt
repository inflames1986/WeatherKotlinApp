package com.inflames1986.weatherkotlinapp

class TestCycles {

    fun makeTestCycles() {

        val weatherList: List<String> = arrayListOf()
        for (weather in weatherList) {
            print(weather)
        }

        weatherList.forEach { weather ->
            print(weather)
        }

        for (i in weatherList.indices) {
            print(weatherList[i])
        }

        for (i in 1..10) {
            print("Hello")
        }

        for (i in 10 downTo 1 step 2) {
            print(i + 4)
        }
    }
}