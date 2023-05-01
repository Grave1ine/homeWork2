package ru.otus.empty.decorator

class Milk(drink: Drink) : Decorator("Milk", drink) {

    public override fun getDeclaration(): String{
        return drink.getDeclaration() + ", milk"
    }

    public override fun value(): Double {
        return drink.value() + 0.5
    }
}