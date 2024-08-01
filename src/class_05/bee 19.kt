package class_05

fun main() {
    // Read the monetary value as a floating point number
    val input = readLine()!!
    val N = input.toDouble()

    // Convert to cents (integer) to avoid floating point precision issues
    var totalCents = (N * 100).roundToInt()

    // Define the denominations of notes and coins in cents
    val notes = listOf(10000, 5000, 2000, 1000, 500, 200) // Notes
    val coins = listOf(100, 50, 25, 10, 5, 1)            // Coins

    // Initialize counts
    val noteCount = IntArray(notes.size)
    val coinCount = IntArray(coins.size)

    // Calculate notes
    for (i in notes.indices) {
        noteCount[i] = totalCents / notes[i]
        totalCents %= notes[i]
    }

    // Calculate coins
    for (i in coins.indices) {
        coinCount[i] = totalCents / coins[i]
        totalCents %= coins[i]
    }

    // Print results
    println("NOTAS:")
    for (i in notes.indices) {
        println("${noteCount[i]} nota(s) de R$ ${notes[i] / 100.0}")
    }

    println("MOEDAS:")
    for (i in coins.indices) {
        println("${coinCount[i]} moeda(s) de R$ ${coins[i] / 100.0}")
    }
}

// Extension function to round to the nearest integer
fun Double.roundToInt() = Math.round(this).toInt()



