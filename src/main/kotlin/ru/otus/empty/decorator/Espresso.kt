package ru.otus.empty.decorator

class Espresso: Drink("Espresso") {

    override fun value(): Double{
        return 1.75
    }

}

class Cappuccino: Drink("Cappuccino"){

    override fun value(): Double{
        return 0.85
    }

}