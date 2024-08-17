package problems
import java.util.Scanner
fun main() {
    var x = Scanner(System.`in`)

    val value = x.nextFloat()

    // Convert value to cents
    var amountInCents = (value * 100).toInt()

    // Define note and coin denominations in cents
    val notes = listOf(10000, 5000, 2000, 1000, 500, 200)
    val coins = listOf(100, 50, 25, 10, 5, 1)

    // Calculate notes
    println("NOTAS:")
    var remainingAmount = amountInCents
    for (note in notes) {
        val count = remainingAmount / note
        remainingAmount %= note
        println("${count} nota(s) de R$ ${note/ 100.00}0 ")
    }

    // Calculate coins
    println("MOEDAS:")
    for (coin in coins) {
        val count = remainingAmount / coin
        remainingAmount %= coin
        if (count == 0 || count == 3 ) {
            println("${count} moeda(s) de R$ ${coin / 100.00}")
        }

        else{
            println("${count} moeda(s) de R$ ${coin / 100.00}0")
        }

    }
}
