package ru.otus.empty.decorator

fun main() {

    val test: Drink = Espresso()   //полиморфизм???
    println(test.getDeclaration() + " " + test.value())

    var test2: Drink = Cappuccino()
    test2 = Milk(test2)
    test2 = Milk(test2)
    println(test2.getDeclaration() + " " + test2.value())

}