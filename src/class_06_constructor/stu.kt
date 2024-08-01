package class_06_constructor

class stu(name:String,age:Int, var clas:String):inharitance(name , age) {
fun display(){
    println("Name : $name")
    println("Age : $age")
    println("Class : $clas")
}

}