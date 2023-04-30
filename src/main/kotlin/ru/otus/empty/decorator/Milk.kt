package ru.otus.empty.decorator

class Milk(name: Drink) : Decorator() {

    public fun milk(drink: Drink = Drink()){
        this.drink = drink
    }

    public override fun getDeclaration(): String{
        return drink.getDeclaration() + ", milk"
    }

    public override fun value(): Double {
        return drink.value() + 0.5
    }
}