package ru.otus.empty.decorator

class Whiskey(drink: Drink) : Decorator("Whiskey", drink) {

     override fun getDeclaration(): String{
        return drink.getDeclaration() + ", whiskey"
    }

     override fun value(): Double {
        return drink.value() + 1.0
    }
}