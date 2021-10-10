package com.inflames1986.weatherkotlinapp

open class MyCopyClass {

    var arg1 = doCopy()

    fun doCopy(): String {

        val mydata = MyDataClass("33414ae", "Victor", 46)
        val copydata = mydata.copy()

        return copydata.name
    }
}