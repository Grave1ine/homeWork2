package ru.otus.empty.decorator

//декоратор

 open class Decorator(var drink: Drink = Drink()): Drink() {

    //var drink: Drink = Drink()

    override fun getDeclaration(): String {               //вернуть название
        return declaration
    }

}