package class_06_constructor

class teach(name:String, age:Int, var id:Int):inharitance(name, age) {
    fun display(){
        println("Name : $name")
        println("Age : $age")
        println("Id : $id")

    }
}