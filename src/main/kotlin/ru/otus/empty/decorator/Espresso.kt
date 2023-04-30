package ru.otus.empty.decorator

class Espresso: Drink() {

    public fun espresso(){
        declaration = "Espresso"
    }

    override fun value(): Double{
        return 1.75
    }

}

class Cappuccino: Drink(){

    public fun cappuccino(){
        declaration = "Cappuccino"
    }

    override fun value(): Double{
        return 0.85
    }

}