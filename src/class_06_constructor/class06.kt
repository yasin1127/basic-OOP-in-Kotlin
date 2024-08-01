package class_06_constructor

class Teacher{
    var name :String = ""
    var id :Int = 0
    var address:String = ""
    constructor()
    constructor(name:String){
        this.name = name
    }
    constructor(name:String, id:Int){
        this.name = name
        this.id = id
    }
    constructor(name:String, id: Int, address:String){
        this.name = name
        this.id = id
        this.address = address
    }
    fun display(){
        println("Teacher Name: $name")
        println("Teacher ID: $id")
        println("Teacher Address: $address")
    }
}
class Student{
    var name :String = ""
    var id :Int = 0
    var address:String = ""
    constructor()
    constructor(name:String){
        this.name = name
        println("Teacher Name: $name")
    }
    constructor(name:String, id:Int){
        this.name = name
        this.id = id
    }
    constructor(name:String, id: Int,address:String){
        this.name = name
        this.id = id
        this.address = address
    }
    fun display(){
        println("Student Name: $name")
        println("Student ID: $id")
        println("Student Address: $address")
    }
}