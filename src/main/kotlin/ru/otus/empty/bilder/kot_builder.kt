package ru.otus.empty.bilder

class Book private constructor(
    private val author: String? = null,
    private val composition: String? = null
){

    fun getAuthor():String?{
        return author
    }

    fun getComposition():String?{
        return composition
    }

    data class Builder(
        var author: String? = null,
        var composition: String? = null
    ){
        fun author(author: String) = apply { this.author = author }

        fun composition(composition: String) = apply { this.composition = composition }

        fun builder() = Book(author, composition)
    }
}

fun main() {
    val book1 = Book.Builder().author("Рэй Дуглас Брэдбери").composition("451 градус по Фаренгейту").builder()
    println("${book1.getAuthor()}  ${book1.getComposition()}")

    val book2 = Book.Builder().author("").composition("неизвестно").builder()
    println("${book2.getAuthor()} ${book2.getComposition()}")
}