fun main() {
    var a = 0
    var b = 1
    var d=0

    for (i in 1 ..10) {

     println("$a")
        d= a+b
        a=b
        b=a
        a=d

    }

}