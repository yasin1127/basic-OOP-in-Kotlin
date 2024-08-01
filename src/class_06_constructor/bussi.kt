package class_06_constructor

class bussi(name:String,age:Int,var income:Float):inharitance(name , age) {
    fun display(){
        println("Name: $name")
        println("Age: $age")
        println("Income: $income")
    }
}