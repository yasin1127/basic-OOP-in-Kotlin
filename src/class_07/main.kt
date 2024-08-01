package class_07
import java.util.Scanner
fun main(args: Array<String>) {
    var x=Scanner(System.`in`)
    var student=stu()
    print("Enter your name: ")
   student.name=x.next()
    print("Enter your age: ")
  student.age=x.nextInt()
    print("Enter your class: ")
    student.A=x.nextInt()
    student.display()
    student.work()

}
