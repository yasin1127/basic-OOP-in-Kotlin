package task_library

abstract class library{
    abstract fun addBook(book:Book)
    abstract fun viewAllBook()
    abstract fun finBooksByAuthor(author:String)
}