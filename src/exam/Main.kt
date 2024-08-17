package exam

fun main() {
    val system = BloodGroupManagementSystem()

    println("Welcome to Blood Group Management System")

    if(system.login()){
        println("Login successfull")
        system.mainMenu()
    }else{
        println("Login failed. Please try again")
    }
}