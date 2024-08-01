package class_04

fun sum(a:Int, b:Int): Int {

    var c = 20+((2*a)+(b+a))
  return c
}
fun main(){
    println (sum(2,3))
 var x = 10 + sum(10,20)
    println(x)
    var y = 50 + sum(10,20)
    println(y)
}