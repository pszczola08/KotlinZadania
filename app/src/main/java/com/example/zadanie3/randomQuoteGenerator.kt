package com.example.zadanie3

object Quotes {
    var quotes = mutableListOf<String>(
        "The only way to do great work is to code. - Steve Jobs",
        "In the middle of every program lies difficulty. - Albert Einstein",
        "Linux is not good, windows is not bad: It is the OS to continue. - Winston Churchill",
        "It does not matter how slowly you code as long as you do not stop using ChatGPT. - Confucius",
        "Believe you can code and you're halfway there. - Theodore Roosevelt"
    )

    fun draw() {
        var draw: Int = (1..<quotes.size).random()

        println(quotes[draw])
    }
    fun add() {
        print("Enter quote: ")
        var quote = readln()

        quotes.add(quote)
    }
}

fun generate() {
    print("Do you want to insert new quote or display random? (I, D) ")
    var answer = readln()
    when(answer) {
        "I" -> Quotes.add()
        else -> Quotes.draw()
    }
    
    generate()
}

fun main() {
    generate()
}