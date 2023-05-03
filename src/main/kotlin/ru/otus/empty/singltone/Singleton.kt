package ru.otus.empty.singltone

 object Singleton  {

     val singleton: Word by lazy {
         Word("Евгений Замятин", "О дивный новый мир")
     }

     fun setSingleton(author: String, composition: String){
            println(Word(author, composition))
    }

 }
