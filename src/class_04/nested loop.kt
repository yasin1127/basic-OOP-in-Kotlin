package class_04

import java.util.Scanner
fun main (){
    var x=Scanner(System.`in`)

    print("Enter the column number = ")
    var a = x.nextInt()
    print("Enter the row number = ")
    var b = x.nextInt()

    for(i in 1..a){

        for (j in 1..b ){
            print("$i$j    ")
        }
        println()
    }

}