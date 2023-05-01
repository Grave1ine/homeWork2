package ru.otus.empty.decorator

fun main() {

    val test: Drink = Espresso()   //полиморфизм???
    println(test.getDeclaration() + " " + test.value())

    var test2: Drink = Cappuccino()
    test2 = Milk(test2)
    test2 = Milk(test2)
    println(test2.getDeclaration() + " " + test2.value())

    val whiskeyMilk = Whiskey(Milk(Espresso()))
    val milkWhiskey = Milk(Whiskey(Espresso()))

    println("Coffee, milk then Whiskey: ${whiskeyMilk.getDeclaration()}: ${whiskeyMilk.value()}")
    println("Coffee, whiskey, then Milk: ${milkWhiskey.getDeclaration()}: ${milkWhiskey.value()}")
}