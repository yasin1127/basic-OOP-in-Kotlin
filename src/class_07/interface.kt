package class_07

import java.util.Scanner

fun main(){
    var x= Scanner(System.`in`)
    var m=s()
    print("Enter your name: ")
    m.name=x.next()
    print("Enter your age: ")
    m.age=x.nextInt()
    m.dis()
    m.ply()
    m.sle()
    m.stu()

}