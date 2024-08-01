package class_07

abstract class person {
    abstract var name:String
    abstract var age:Int
    open var A:Int=0
    fun display(){
        println ("Name: $name")
        println("Age: $age")
        println("Class: $A")
    }
    abstract fun work()
}