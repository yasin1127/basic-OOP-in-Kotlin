package class_05
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var value = scanner.nextDouble()
    val notas = intArrayOf(100, 50, 20, 10, 5, 2)
    val moedas = intArrayOf(100, 50, 25, 10, 5, 1)
    val valorNota = intArrayOf(100, 50, 20, 10, 5, 2)
    val valorMoeda = intArrayOf(50, 25, 10, 5, 1)

    println("NOTAS:")
    for (i in notas.indices) {
        val quantidadeNotas = (value / notas[i]).toInt()
        println("$quantidadeNotas nota(s) de R$ ${valorNota[i]}.00")
        value -= quantidadeNotas * notas[i]
    }

    println("MOEDAS:")
    value *= 100
    for (i in moedas.indices) {
        val quantidadeMoedas = (value / moedas[i]).toInt()
        println("$quantidadeMoedas moeda(s) de R$ ${valorMoeda[i] / 100.0}")
        value -= quantidadeMoedas * moedas[i]
    }
}