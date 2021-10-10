package com.inflames1986.weatherkotlinapp

open class Person(val firstName: String, var lastName: String, val age: Int) {

    private val a = 10
    private var name: String? = "Vladimir"
    private var surname: String? = null
    private val list: List<String> = ArrayList()

    init {
        lastName = "Ivanov"
        setInitValues()
        someFun(100, "a", "b")
        someFun2(b = 10.0)
    }

    fun setSurname(surname: String) {
        this.surname = surname
    }

    fun setInitValues() {
        name = null
        name = "Alexander"
        println(name)
        val url = RestClient.url
        val userName = RestClient.getUserName()
    }

    fun sum(a: Int, b: Int): Int {
        val primitiveInts = intArrayOf(1, 2)
        val array = arrayOf(1, 2)
        val array2 = emptyArray<Int>()
        val array3 = Array(5) { 0 }
        val arraylist = arrayListOf(1, 2, 3)
        val arrayList2 = arrayListOf<Int>()

        return a + b
    }

    fun someFun(sum: Int = 0, vararg strings: String) {
        val first = strings[0]
    }

    fun someFun2(a: Int = 0, b: Double) {

    }

    fun sumDouble(a: Double, b: Double) = a + b
}