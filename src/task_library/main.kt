package task_library


fun main (){
    val library = Publiclibrary()
    library.addBook(Book("1986","George orwell",1946))
    library.addBook(Book("To Kill a Mockingbird", "Harper Lee",1960))
    library.addBook(Book("Brave New World","Aldous Huxley",1932))

    println("All books in the library:")
    library.viewAllBook()
    val authorToFind="George orwell"
    println("You Find This Book '$authorToFind':")
    library.finBooksByAuthor(authorToFind)
}