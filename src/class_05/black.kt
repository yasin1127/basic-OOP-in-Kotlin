package class_05
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var value = scanner.nextInt()
    val notes = intArrayOf(100, 50, 20, 10, 5, 2, 1)

    println(value)
    for (note in notes) {
        val count = value / note
        println("$count nota(s) de R$ $note,00")
        if (count > 0) {
            value -= (count * note)
        }
    }
}