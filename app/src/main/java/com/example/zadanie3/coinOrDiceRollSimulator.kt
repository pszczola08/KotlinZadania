package com.example.zadanie3

class Draw {
    companion object {
        fun Coin(): String {
            var coinRandom = (1..2).random()
            var coin = ""
            when(coinRandom) {
                1 -> coin = "Heads"
                else -> coin = "Tails"
            }

            return coin
        }

        fun Dice(): Int {
            var diceRandom = (1..6).random()

            return diceRandom
        }
    }
}

fun program() {
    print("Do you want to flip a coin or roll a dice? (C, D): ")
    var answer = readln()
    var result = when(answer) {
        "C" -> Draw.Coin()
        else -> Draw.Dice()
    }
    println("Result: ${result}")
    println("")

    program()
}

fun main() {
    program()
}