package class_03

import java.util.Scanner
fun main (){
    var x= Scanner(System.`in`)

    println("Enter the number : ")
    var a = x.nextInt()

    if (a % 2 == 0){
        println("Even")
    }
    else{
        println("Odd")
    }
}