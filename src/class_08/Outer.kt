package class_08

class O{
    var name:String="MD. YASIN"


    inner class Boo{

        fun display()=name
   }
}
fun main(args: Array<String>) {

    val x = O()
    println("Using outer object: ${x.Boo().display()}")

    val inner = O().Boo()
    println("Using inner object: ${inner.display()}")
}