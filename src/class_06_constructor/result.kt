package class_06_constructor

fun main() {
    var a=Teacher()
    var c=Teacher("alif")
    var d=Teacher("shorif",1100)
    var e=Teacher("Jolil",1001,"Tejgaon")

    var b=Student()
    var x=Student("B")
    var y=Student("c",101)
    var z=Student("D",102,"Farmgate")

    a.name="Syful haque"
    a.id=1000
    a.address="Shobanbag"
    a.display()

    println()
    b.name="Salad"
    b.id=102
    b.address="Daffodil"
    b.display()

    println()
    println("${c.name}")
    println("${d.name}   ${d.id}")
    println("${e.name}    ${e.id}     ${e.address} ")

    println()
    println("${x.name}")
    println("${y.name}   ${y.id}")
    println("${z.name}   ${z.id}     ${z.address} ")
}
