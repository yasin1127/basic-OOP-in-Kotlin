package exam

import java.util.Scanner

fun main(args: Array<String>) {
    var x=Scanner(System.`in`)

    var A=x.nextInt()
    var B=x.nextInt()
    var C= x.nextInt()
    var D= x.nextInt()

    if(B>C && D>A && (C+D)>(A+B) && C>0 && D>0 && A%2==0){
        println("Valores aceitos")
    }
    else{
        println("Valores nao aceitos")
    }
}