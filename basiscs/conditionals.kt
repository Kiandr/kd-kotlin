//https://developer.android.com/kotlin/learn#conditionals

if (coutn == 42){
    println(" I have an answer")
}else{
    println(" I do not have an answer")
}

val answerString: String = if ( count == 42){
    println("The answer is 42")
}else
{
    println("The answer is not here")
}

println(answerString)

val answerString: String = when{
    count == 41 -> "I have answer"
    count > 35 -> "The answer is close"
    else -> "The answer is empty"
}