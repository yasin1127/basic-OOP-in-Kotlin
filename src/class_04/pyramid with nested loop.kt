package class_04

fun  main (){
    val a=5
    var b=0
    for (i in 1..a){
        for (space  in 1..a-i){
            print("  ")
        }
        while (b!=2*i-1){
            print(" 0")
            ++b
        }
        b=0
        println()

    }
}