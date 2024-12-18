package com.example.zadanie3

import kotlin.math.max

class Results {
    companion object {
        var results = mutableListOf(
            Score("Game 1", 100),
            Score("Game 2", 90),
            Score("Game 3", 85),
            Score("Game 4", 80),
            Score("Game 5", 75)
        )
    }
}

fun sport() {
    print("What do you want to do? (1 - filter games, 2 - show sum of points, 3 - show max score, 4 - show difference between lowest and highest score) ")
    var answer: String = readln()
    when(answer) {
        "1" -> {
            print("What is the minimum score? ")
            var minsc = readln().toInt()
            var localList = Results.results.filter { it.points >= minsc }
            println("Found ${localList.size} games:")
            for(element in localList) {
                println("${element.name} - ${element.points} points.")
            }

            println()
        }
        "2" -> {
            var sum = 0
            for (game in Results.results) {
                sum += game.points
            }

            println(sum)
            println()
        }
        "3" -> {
            var max = 0
            for (game in Results.results) {
                if(max < game.points) {
                    max = game.points
                }
            }
            println(max)
            println()
        }
        "4" -> {
            var max = 0
            for (game in Results.results) {
                if(max < game.points) {
                    max = game.points
                }
            }
            var min = Results.results[0].points
            for (game in Results.results) {
                if(min > game.points) {
                    min = game.points
                }
            }

            println(max - min)
            println()
        }
        else -> sport()
    }

    sport()
}
fun main() {
    sport()
}

data class Score (
    val name: String,
    val points: Int
)