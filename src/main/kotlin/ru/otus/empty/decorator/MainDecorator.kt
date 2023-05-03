package ru.otus.empty.decorator

fun main() {

    val betta = Whiskey(Milk(Whiskey(Milk(Cappuccino()))))
    println("betta: " + betta.getDeclaration() + " " + betta.value())

    val whiskeyMilk = Whiskey(Milk(Espresso()))
    val milkWhiskey = Milk(Whiskey(Espresso()))

    println("Coffee, milk then Whiskey: ${whiskeyMilk.getDeclaration()}: ${whiskeyMilk.value()}")
    println("Coffee, whiskey, then Milk: ${milkWhiskey.getDeclaration()}: ${milkWhiskey.value()}")
}


/*
суть декоратора: реализуется основной класс "Drink" сколь угодно большим кол.во реализаторов.
в реализаторах переопределяется метод  value(). далее от основного класса "Drink" наследуется основной декоратор "Decorator".
он послужит последующей заготовкой для мелких декораторов, конструктор принимает название и переменную типа "Drink".
т.к все эти классы наследуются от одного, они все могут представляться как более младший тип(работает полиморфизм).
мелкие декораторы принимают в себя переменную типа "Drink" + добавляют свое название. переопределяют методы так чтобы
они работали как у переданного им объекта + свое значение. ВАЖНО!!! мелкие декораторы наворачиваются на реализатор! т.е он будет глубже всех
пример -- "Whiskey(Milk(Whiskey(Milk(Cappuccino())))" тут Cappuccino  является реализатором все остальное декро, можно навешивать сколько угодно
 */