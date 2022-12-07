package com.example.book.dara

import com.example.book.R
import com.example.book.model.Book

class Datarse {

    fun loudbook() : List<Book> {
        return listOf (
            Book(R.string.Book1),
        Book(R.string.Book2),
        Book(R.string.Book3),
        Book(R.string.Book4),
        Book(R.string.Book5)
        )
    }
}