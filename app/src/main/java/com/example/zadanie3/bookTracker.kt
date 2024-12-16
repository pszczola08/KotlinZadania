package com.example.zadanie3

class Books {
    companion object {
        val books = listOf<Book>(
            Book("Josh Skeen", "Kotlin Programming: The Big Nerd Ranch Guide", "Programming"),
            Book("Dmitry Jemerov", "Kotlin in Action", "Programming"),
            Book("J.K. Rowling", "Harry Potter and the Linuxer's Stone", "Fantasy"),
            Book("Robert C. Sharp", "Linux is good", "Fantasy"),
            Book("George Orwell", "1984", "Dystopian"),
            Book("J.R.R. Tolkieng", "The Hobbit", "Fantasy"),
            Book("Stephen Hawk King", "The Sharping", "Horror"),
            Book("React Asimov", "Foundation", "Science Fiction")
        )

        val fav = mutableListOf<String>()
    }
}

fun Tracker() {
    print("What do you want to do? (A - Add book to favorites, B - Display favorites, C - Look for book): ")
    var ans: String? = readlnOrNull();
    when(ans) {
        "A" -> {
            print("Enter name of the book: ")
            var name: String = readln()
            var bk = Books.books.filter { it.Title == name }
            if(bk.size == 1) {
                Books.fav.add(name)
                println("Book ${name} has been added to the favorites!")
            } else {
                println("The book doesn't exist!")
            }
            println()
        }
        "B" -> {
            for (book in Books.fav) {
                println(book)
            }
            println()
        }
        "C" -> {
            print("Enter name of the author: ")
            var author: String = readln()
            print("Enter genre of the book: ")
            var genre: String = readln()
            var localBooks = Books.books
            if(author != "") {
                localBooks = localBooks.filter { it.Author == author }
            }
            if(genre != "") {
                localBooks = localBooks.filter { it.Genre == genre }
            }
            for(book in localBooks) {
                println(book.Title)
            }
        }
        else -> Tracker()
    }

    Tracker()
}

fun main() {
    Tracker()
}

data class Book(val Author: String, val Title: String, val Genre: String);