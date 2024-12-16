package com.example.zadanie3

import androidx.core.util.Consumer

class StepTracker {
    companion object {
        var Steps = 0

        fun Step() {
            Steps++
        }
        fun Reset() {
            Steps = 0
        }
    }
}

fun steps() {
    print("What do you want to do? (R - Reset Steps, S - Show Steps, Other - Make step): ")
    var c = readln()
    when(c) {
        "R" -> StepTracker.Reset()
        "S" -> println("${StepTracker.Steps} \n")
        else -> StepTracker.Step()
    }

    steps()
}
fun main() {
    steps()
}