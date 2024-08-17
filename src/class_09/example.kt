package class_09


    class a(){
        private var x:Boolean=true

        fun b(){
            x=true
        }
        fun c(){
            x=false
        }
        fun dis (){
            if (x == true)
                println("YES")
            else
                println("NO")
        }
    }
fun main(args: Array<String>) {
    var y=a()
    var a1=a()

    y.b()
    a1.c()
    y.dis()
    a1.dis()
}