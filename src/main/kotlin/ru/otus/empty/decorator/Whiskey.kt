package ru.otus.empty.decorator

class Whiskey(drink: Drink) : Decorator("Whiskey", drink) {

    public override fun getDeclaration(): String{
        return drink.getDeclaration() + ", whiskey"
    }

    public override fun value(): Double {
        return drink.value() + 1.0
    }
}