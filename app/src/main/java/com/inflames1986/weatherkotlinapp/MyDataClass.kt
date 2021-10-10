package com.inflames1986.weatherkotlinapp

data class MyDataClass(val serial: String, val name: String, val age: Int) {
    fun getNameUpperCase() = name.uppercase()
}

