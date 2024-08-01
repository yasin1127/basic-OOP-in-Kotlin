package class_03

import java.util.Scanner
fun main (){
    var x =Scanner(System.`in`)

    var num = x.nextInt()
    var factorial: Long = 1
    for (i in 1..num) {

        factorial *= i.toLong()
    }
    println("Factorial of $num = $factorial")
}