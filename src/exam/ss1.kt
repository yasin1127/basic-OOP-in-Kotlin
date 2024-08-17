package exam
import java.util.Scanner
import kotlin.time.times


fun main() {
    var x=Scanner(System.`in`)

    var A= x.nextInt()
    var B=x.nextInt()
    var C=x.nextInt()
    var D=x.nextInt()

    var result= (A*B)-(C*D)
    println("DIFERENCA = $result")
}