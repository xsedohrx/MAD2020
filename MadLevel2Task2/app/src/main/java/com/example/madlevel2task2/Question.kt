package com.example.madlevel2task2

data class Question (
    var questionText:String,
    var answer: Int
)
{
    companion object{
        val QUESTIONS = arrayOf(
            "A val and var are the same.",
            "Mobile Application Development grants 12 ECTS.",
            "A Unit in Kotlin corresponds to a void in Java.",
            "In Kotlin 'When'replaces the 'switch' operator in Java."
        )

        val ANSWERS = arrayOf(
            8,
            8,
            8,
            4
        )
    }
}