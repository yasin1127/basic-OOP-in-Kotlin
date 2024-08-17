package class_09


class emp1(var name:String,Salary:Int , Age:Int , Dept:String):inheritance_exmple(Salary,Age,Dept){
    fun e1(){
        println("$name $Salary $Age")
    }
}
class emp2(var name:String,Salary:Int , Age:Int , Dept:String):inheritance_exmple(Salary,Age,Dept){
    fun e3(){
        println("$name $Salary $Age")
    }
}
class emp3(var name:String,Salary:Int , Age:Int , Dept:String):inheritance_exmple(Salary,Age,Dept){
    fun e2(){
        println("$name $Salary $Age")
    }
}

fun main(args: Array<String>) {
    var x=emp1("hanif",20000,20,"finance")
    x.e1()
    var y=emp1("jahid",21000,21,"finance")
    y.e1()
    var z=emp1("kamal",20500,20,"finance")
    z.e1()
}
