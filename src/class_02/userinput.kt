package class_02

import java.util.Scanner
fun main(){
    var scan = Scanner(System.`in`)
    var a = scan.nextInt()
    var b = scan.nextInt()
    var sum = a+b
    var sub = a-b
    var mul = a*b
    var div = a/b.toDouble()
    var mod = a%b

    println("sum:$sum")
    println("Sub:$sub")
    println("mul:$mul")
    println("div:$div")
    println("mod:$mod")
}