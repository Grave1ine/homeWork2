package ru.otus.empty.decorator

//базовый класс

open class Drink {                                 //напиток

    protected var mDeclaration: String = " "                    //описанрие/название

    open fun getDeclaration(): String {               //вернуть название
        return mDeclaration
    }

    open fun value(): Double{                              //вернуть цену
        return 0.0
    }

}