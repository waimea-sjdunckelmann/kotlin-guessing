/**
 * A little guessing game in kotlin
 */




fun main() {
    println("------------------------------")
    println("GUESSING GAME % MILLION")
    println("------------------------------")
    println()
    val numToGuess = (1..100).random()
    var guesses = 1
    println("I'm thinking of a number from 1 to 100")
    println("Can you guess it?")

    while (true) {
        print ("Enter a Nuber between 1 and 100: ") // Ask the user for a guess
        val number = readln().toIntOrNull()

        if (number == null) {
            println("Thats not a Number")
        }
        else {
            var difference = (number - numToGuess)
            if(difference < 0) {difference = difference * -1 }
            println ("(Difference is $difference)")
            println ("(Number to guess is $numToGuess)")
            if (difference > 10) {"Bigger than 10 Away"}
            if (difference < 10) {"Less than 10 Away"}

            if (number > numToGuess) {
                if (difference >= 50) {println ("Very bad guess! Go Lower!")}
                else if (difference >=20 && difference < 50) {println("Not there Yet! Go Lower!")}
                else if (difference >=10 && difference < 20) {"Almost! Go Lower!"}
                else {"Very Very Close! Just a bit Lower!"}
            }

            else if (number < numToGuess) {
                if (difference >= 50) {"Very bad guess! Go Higer!"}
                else if (difference >=20 && difference < 50) {"Not there Yet! Go Higer!"}
                else if (difference >=10 && difference < 20) {"Almost! Go Higer!"}
                else {"Very Very Close! Just a bit higer!"}
                }

            else {
                println("YOU HAVE WON! The Number was $numToGuess")
                println("You took $guesses")
                break
            }
            guesses++
        }

    }
}

