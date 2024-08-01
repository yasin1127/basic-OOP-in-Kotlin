package class_04

fun main (){
    for (i in -10..10){
        if (i == 3 || i == 9){
            if (i%2==1){
            break
            }
            continue
        }
        print("$i ")
    }
}