package class_06_constructor
import java.util.Scanner
fun main() {
    var x=Scanner(System.`in`)
    val n = x.nextDouble()

    val banknotes = arrayOf(100,50,20,10,5,2)
    val coins = arrayOf(1.00,0.50,0.25,0.10,0.05)

    var remainingValue = n

    for (banknote in banknotes) {
        val count = remainingValue / banknote
        remainingValue %= banknote
        println("${count} ${banknote / 100} notes")
    }

    for (coin in coins) {
        val count = remainingValue / coin
        remainingValue %= coin
        println("${count} ${coin / 100.0} coins")
    }
}