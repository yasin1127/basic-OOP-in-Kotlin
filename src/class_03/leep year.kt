package class_03

import java.util.Scanner

fun main() {
    var x = Scanner(System.`in`)

    println("enter the year = ")
    var y = x.nextInt()
    var c = y % 400
    var d = y % 4
    var e = y / 100
    if (c == 0) {
        println("this is leap year")
    } else if (d == 0 && e != 0) {
        println("this is leap year")
    } else {
        println("this is not leap year")
    }
}