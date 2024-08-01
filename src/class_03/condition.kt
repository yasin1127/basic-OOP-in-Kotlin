package class_033

fun main() {


    var a = 11;
    var b = 22;
    var c = 33;

    if (a > b && a > c) {
        println("A is the largest." )
    }
    else if (b > a && b > c) {
        println("B is the largest.")
    }
    else if (c > a && c > b) {
        println(" C is the largest." )
    }
    else if (a == b && a > c) {
        println("A and B are equals.")
    }
    else if (b ==c && b > a) {
        println("B and C are equals." )
    }
    else if (a == c && a>b) {
        println("A and C are equals." )
    }
    else if (a==c && c>b){
        println("A and C are equals." )
    }
    else if (a==b && b==c){
        println("Both are equals." )
    }
    else {
        println("Values are not unique")
    }
}