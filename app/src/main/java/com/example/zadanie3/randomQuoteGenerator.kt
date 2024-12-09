package com.example.zadanie3

object Quotes {
    var quotes = mutableListOf<String>(
        "The only way to do great work is to love what you do. - Steve Jobs",
        "In the middle of every difficulty lies opportunity. - Albert Einstein",
        "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
        "It does not matter how slowly you go as long as you do not stop. - Confucius",
        "Believe you can and you're halfway there. - Theodore Roosevelt"
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