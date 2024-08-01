package task_library

class Publiclibrary:library(){
    private val books= mutableListOf<Book>()
    override fun addBook(book: Book) {
        books.add(book)
    }

    override fun viewAllBook() {
        if(books.isEmpty()){
            println("No books found")
        }
        else{
            for(book in books){
                println("Title: ${book.title} Authir: ${book.author}  Year: ${book.year}")
            }
        }
    }

    override fun finBooksByAuthor(author: String) {
        val foundBooks = books.filter { it.author == author }
        if(foundBooks.isEmpty()){
            println("No books found By Author: $author")
        }
        else{
            for(book in foundBooks){
                println ("Title: ${book.title} Authir: ${book.author} Year: ${book.year}")
            }
        }
    }

}