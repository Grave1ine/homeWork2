package ru.otus.empty.singltone

data class Word(
    val author: String? = null,
    val composition: String? = null){

    override fun toString(): String {
        return "author = $author, composition = $composition"
    }
}
