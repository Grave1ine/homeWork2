package ru.otus.empty.decorator

fun main() {

    val betta = Whiskey(Milk(Whiskey(Milk(Cappuccino()))))
    println("betta: " + betta.getDeclaration() + " " + betta.value())

    val whiskeyMilk = Whiskey(Milk(Espresso()))
    val milkWhiskey = Milk(Whiskey(Espresso()))

    println("Coffee, milk then Whiskey: ${whiskeyMilk.getDeclaration()}: ${whiskeyMilk.value()}")
    println("Coffee, whiskey, then Milk: ${milkWhiskey.getDeclaration()}: ${milkWhiskey.value()}")
}