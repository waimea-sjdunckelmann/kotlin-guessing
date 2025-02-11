/**
 * A little guessing game in kotlin
 */




fun main() {
    println("------------------------------")
    println("GUESSING GAME % MILLION")
    println("------------------------------")
    println()
    val numToGuess = (1..100).random()
    println("I'm thinking of a number from 1 to 100")
    println("Can you guess it?")

    while (true) {
        print ("Enter a Nuber between 1 and 100: ") // Ask the user for a guess
        val number = readln().toIntOrNull()

        when (number) {
            null -> println("Thats not a Number")
            3 -> println("Thats greater than 2!")
            6 -> println("Thats interesting")
            else -> println("Yes, that is a number")
        }

        // check if its correct or not

        //Break out of the loop if its correct

        //Otherwise give high/lower feedback
    }
}