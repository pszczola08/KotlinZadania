package com.example.zadanie3

class Questions {
    companion object {
        var questions = listOf(
            Question(
                content = "What is the capital of France?",
                a1 = "A. Berlin",
                a2 = "B. Madrid",
                a3 = "C. Paris",
                a4 = "D. Rome",
                correct = "C"
            ),
            Question(
                content = "Who wrote 'Romeo and Juliet'?",
                a1 = "A. William Shakespeare",
                a2 = "B. Charles Dickens",
                a3 = "C. Mark Twain",
                a4 = "D. Jane Austen",
                correct = "A"
            ),
            Question(
                content = "What is the largest planet in the Solar System?",
                a1 = "A. Earth",
                a2 = "B. Mars",
                a3 = "C. Jupiter",
                a4 = "D. Saturn",
                correct = "C"
            ),
            Question(
                content = "What is the chemical symbol for water?",
                a1 = "A. H2O",
                a2 = "B. O2",
                a3 = "C. CO2",
                a4 = "D. H2",
                correct = "A"
            ),
            Question(
                content = "Who painted the Mona Lisa?",
                a1 = "A. Vincent van Gogh",
                a2 = "B. Pablo Picasso",
                a3 = "C. Leonardo da Vinci",
                a4 = "D. Claude Monet",
                correct = "C"
            ),
            Question(
                content = "How many continents are there on Earth?",
                a1 = "A. 5",
                a2 = "B. 6",
                a3 = "C. 7",
                a4 = "D. 8",
                correct = "C"
            ),
            Question(
                content = "Which language is the most spoken worldwide?",
                a1 = "A. English",
                a2 = "B. Spanish",
                a3 = "C. Mandarin Chinese",
                a4 = "D. Hindi",
                correct = "C"
            )
        )
    }
}

fun main() {
    var correct = 0
    for (question in Questions.questions) {
        print("${question.content}: ${question.a1}, ${question.a2}, ${question.a3}, ${question.a4} ")
        var ans = readln()
        if(ans == question.correct) {
            correct++
        }
    }

    println("Number of correct answers: ${correct}")
}

data class Question(
    val content: String,
    val a1: String,
    val a2: String,
    val a3: String,
    val a4: String,
    val correct: String
)