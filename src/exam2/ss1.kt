package exam2

fun main() {
    val numbers= mutableListOf<Int>()

    for (i in 1..5){

        var input = readLine()
        var number = input?.toInt()
        if (number!=null){
            numbers.add(number)

        }
        else{
            println("Invalid input")
        }
    }
    val x=numbers.count{it %2==0}
    println("$x valores pares")
}
