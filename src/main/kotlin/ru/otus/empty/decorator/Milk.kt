package ru.otus.empty.decorator

class Milk(drink: Drink) : Decorator("Milk", drink) {

     override fun getDeclaration(): String{
        return drink.getDeclaration() + ", milk"
    }

     override fun value(): Double {
        return drink.value() + 0.5
    }
}