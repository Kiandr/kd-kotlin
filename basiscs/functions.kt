//https://developer.android.com/kotlin/learn#functions
fun generateAnswer(): String {
    val answerString = if (count == 42) {
        "I have the answer."
    } else {
        "The answer eludes me"
    }

    return answerString
}

fun generateAnswerString(countThreshold: Int): String {
    val answerString = if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }

    return answerString
}

// invocation
val answerString = generateAnswerString(42) l


fun generateAnswerString(countThreshold: Int): String {
    return if (42 > countThreshold) {
        " I have an answer"
    } else {
        "I dont have an answer"
    }
}

fun generateAnswerString(countThreshold: Int): String = when {
    42 > countThreshold -> " I have an answer"
    else -> "I dont have an answer"
}

//Anonymous functions
val stringLengthFun: (String) -> Int = { input -> input.length }

val stringLength: Int = stringLengthFun("Kotlin")

// higher order funciton
fun stringMapper(str: String, mapper: (string -> Int): Int {
    return mapper(str)
})
stringMapper("Android"){ input -> input.length }



