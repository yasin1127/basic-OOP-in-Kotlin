package class_08

class Outer{
    var name:String="MD. YASIN"

    class Boo{
        var a=Outer()
        fun display(){
            println("NAME: ${a.name}")
        }
    }
}
fun main(){

    val c= Outer.Boo()
    c.display()
}