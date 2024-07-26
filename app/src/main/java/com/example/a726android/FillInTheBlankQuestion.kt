package com.example.a726android

class FillInTheBlankQuestion (
    val questionText:String,
    val answer:String,
    val difficulty:String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)

class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

// =

data class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main(){
    val question1 = Question<String>("Quoth the raven___","nevermore",Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green",false,Difficulty.EASY)
    val question3 = Question<Int>("How many days are there",28,Difficulty.HARD)
    println(question1.toString())
    println(question2.toString())
    println(question3.toString())
}

enum class Difficulty{
    EASY,MEDIUM,HARD
}
