package com.inflames1986.weatherkotlinapp

class Man(firstName: String, lastName: String, age: Int) : Person(firstName, lastName, age),
    SomeInterface {

    init {
        setInitValues()
    }

    override var someValue: String = "Default Value"
        get() = TODO("Not yet implemented")

    var index: Int = 2
        get() = field + 1
        private set(value) {
            print(value)
            field = value
        }


    override fun someCalc() {
        2 + 2
        someValue = "New value only in class"
    }
}