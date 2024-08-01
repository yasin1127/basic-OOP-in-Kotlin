package class_03

import java.util.Scanner
fun main (){
    var x = Scanner(System.`in`)
    print("Enter The Present Year :")
    var a=x.nextInt()
    print("Enter The Birth of  Year :")
    var b=x.nextInt()
    print("Enter The Number of Present of  Month :")
    var c=x.nextInt()
    print("Enter The Number of Birth of  Month :")
    var d=x.nextInt()
    println()
    println()

    var y= (a-1)-b
    var z= (c+12)-d
    if(z==12){
        var p= y+1
        var q= z-12
        println("Your Age is : $p")
        println("Your Age in Month is : $q")
    }
    else {
        println("Your Age is : $y")
        println("Your Age in Month is : $z")

    }
}