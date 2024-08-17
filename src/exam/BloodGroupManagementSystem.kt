package exam
import java.time.LocalDateTime

class BloodGroupManagementSystem {


        private val donors = mutableListOf<Donor>()
        private val users = mutableListOf<User>()

        init {
            //Users
            users.add(User("admin", "123456"))
            users.add(User("musfiq", "123456"))
            users.add(User("sakib", "123456"))

            //Donors
            donors.add(Donor("Musfiqur Rahman", "Dhaka", "O+","13/07/2024","01 "))
            donors.add(Donor("Ayesha Siddiqua", "Chittagong", "A+","13/07/2024","02 "))
            donors.add(Donor("Tahsin Ahmed", "Sylhet", "B+","13/07/2024","03 "))
            donors.add(Donor("Fahim Karim", "Khulna", "AB+","13/07/2024","04 "))
            donors.add(Donor("Rifat Hasan", "Rajshahi", "O-","13/07/2024","05 "))
            donors.add(Donor("Tanzila Alam", "Barisal", "A-","13/07/2024","06 "))
            donors.add(Donor("Sabrina Khan", "Mymensingh", "B-","13/07/2024","07 "))
            donors.add(Donor("Nazmul Huda", "Rangpur", "AB-","13/07/2024","08 "))
            donors.add(Donor("Hasan Mahmud", "Dhaka", "O+","13/07/2024","09 "))
            donors.add(Donor("Razia Sultana", "Chittagong", "A+","13/07/2024","10 "))
            donors.add(Donor("Zahid Hasan", "Sylhet", "B+","13/07/2024","11"))
            donors.add(Donor("Shakil Ahmed", "Khulna", "AB+","13/07/2024","12"))
            donors.add(Donor("Munira Begum", "Rajshahi", "O-","13/07/2024","13"))
            donors.add(Donor("Farzana Akter", "Barisal", "A-","13/07/2024","14"))
            donors.add(Donor("Jamil Hossain", "Mymensingh", "B-","13/07/2024","15"))
            donors.add(Donor("Moin Uddin", "Rangpur", "AB-","13/07/2024","16"))
            donors.add(Donor("Nadia Rahman", "Dhaka", "O+","13/07/2024","17"))
            donors.add(Donor("Rubel Hossain", "Chittagong", "A+","13/07/2024","18"))
            donors.add(Donor("Sadia Islam", "Sylhet", "B+","13/07/2024","19"))
            donors.add(Donor("Tariq Aziz", "Khulna", "AB+","13/07/2024","20"))
             }

        //login user
        fun login():Boolean{
            print("Enter Username: ")
            val userName = readLine()!!
            println()
            print("Enter Password: ")
            val password = readLine()!!
            println()

            return users.any{
                it.username == userName && it.password == password
            }

        }

        fun searchDonor(){
            print("Enter Donor Name OR Address OR Blood Group: ")
            val query = readLine()!!.trim().lowercase()
            println()

            val results = donors.filter {
                it.name.lowercase().contains(query) || it.address.lowercase().contains(query) || it.bloodGroup.lowercase().contains(query)
            }

            if(results.isEmpty()){
                println("No donor found")
            }else{
                println("Donor found")
                var i = 1
                results.forEach{
                    println("Donor: ${i++}")
                    println("Name: ${it.name}")
                    println("Address: ${it.address}")
                    println("Blood Group: ${it.bloodGroup}")
                    println()
                }
            }
        }

        fun searchDonor2(){
            print("Enter Donor Name OR Address OR Blood Group: ")
            val query = readLine()!!.trim().lowercase()
            println()

            val results = donors.filter {
                it.name.lowercase().contains(query) || it.address.lowercase().contains(query) || it.bloodGroup.lowercase().contains(query)
            }

            if(results.isEmpty()){
                println("No donor found")
            }else{
                println("Donor found")
                var i = 1
                results.forEach{
                    println("Donor: ${i++}")
                    println("Name: ${it.name}")
                    println("Address: ${it.address}")
                    println("Blood Group: ${it.bloodGroup}")
                    println()
                }
            }
        }

        fun addDonor(){
            print("Enter Donor Name: ")
            val name = readLine()!!
            println()

            print("Enter Donor Address: ")
            val address = readLine()!!
            println()

            println("Enter Blood Group: ")
            val bloodGroup = readLine()!!
            println()

            println("Enter  last Date Of Donation: ")
            val  lastDateOfDonation = readLine()!!
            println()

            println("Enter  id Of Donation: ")
            val  id = readLine()!!
            println()

            donors.add(Donor(name, address, bloodGroup, lastDateOfDonation, id ))
            println("Donor Added Successfully")
        }

        fun b(){
            for (Donor in donors){
                println("Donor name: "+Donor.name )
                println("Donor Address: "+Donor.address)
                println("Donor Blood group: "+Donor.bloodGroup)
                println("Donor last Date Of Donation: "+Donor.lastDateOfDonation)
                println("Donor Id: "+Donor.id)
                println()
            }
        }

        fun mainMenu(){
            while (true){
                println("__________________Main Menu__________________")
                println("1.Search Donor")
                println("2.Add Donor")
                println("3.Search Donor Name in list")
                println("4.View all Doners list")
                println("0.Exit")
                println("Enter your choice: ")
                when(readLine()){
                    "1" -> searchDonor()
                    "2" ->addDonor()
                    "3" -> searchDonor2()
                    "4" -> b()
                    "0" -> {
                        println("Exiting")
                        return
                    }
                    else -> {
                        println("Invalid choice. Please try again")
                    }
                }
            }
        }



    }
