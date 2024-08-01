package class_07
import class_04.sum
import java.util.Scanner
fun main(){
    var x=Scanner(System.`in`)
    print("Enter the number: ")
    var a=x.nextDouble()
    print("Enter the number: ")
    var b=x.nextDouble()
    print("Enter the number: ")
    var c=x.nextInt()
    print("Enter the number: ")
    var d=x.nextInt()

    println(sum(a,b))
    sum(a,b,c)
    println("Here= ${sum(a,b,c,d)}")


}


fun sum(a:Double,b:Double):Double{
    return a*b
}
fun sum(a:Double,b:Double,c:Int){
    println("Result: ${a+c+b}")
}
fun sum(a:Double,b:Double,c:Int,d:Int):Double{
    return (a+b+c)*d
}