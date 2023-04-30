package ru.otus.empty.decorator

//базовый класс

open class Drink {                                 //напиток

    var declaration: String = " "                    //описанрие/название

    open fun getDeclaration(): String {               //вернуть название
        return declaration
    }

    open fun value(): Double{                              //вернуть цену
        return 0.0
    }

}