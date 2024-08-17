package exam2

import kotlin.system.exitProcess

data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val genre: String,
    var available: Boolean
)

data class Member(
    val id: Int,
    val name: String,
    val contactInfo: String
)

class LibraryManagementSystem {

    private val books = mutableListOf(
        Book(1, "To Kill a Mockingbird", "Harper Lee", "Fiction", true),
        Book(2, "1984", "George Orwell", "Dystopian", true),
        Book(3, "Moby Dick", "Herman Melville", "Adventure", true),
        Book(4, "The Great Gatsby", "F. Scott Fitzgerald", "Classic", true),
        Book(5, "Pride and Prejudice", "Jane Austen", "Romance", true),
        Book(6, "The Catcher in the Rye", "J.D. Salinger", "Fiction", true),
        Book(7, "The Hobbit", "J.R.R. Tolkien", "Fantasy", true),
        Book(8, "Brave New World", "Aldous Huxley", "Dystopian", true),
        Book(9, "Fahrenheit 451", "Ray Bradbury", "Science Fiction", true),
        Book(10, "Jane Eyre", "Charlotte Brontë", "Classic", true),
        Book(11, "Wuthering Heights", "Emily Brontë", "Classic", true),
        Book(12, "Crime and Punishment", "Fyodor Dostoevsky", "Psychological", true),
        Book(13, "The Catcher in the Rye", "J.D. Salinger", "Fiction", true),
        Book(14, "War and Peace", "Leo Tolstoy", "Historical", true),
        Book(15, "The Lord of the Rings", "J.R.R. Tolkien", "Fantasy", true),
        Book(16, "The Chronicles of Narnia", "C.S. Lewis", "Fantasy", true),
        Book(17, "The Diary of a Young Girl", "Anne Frank", "Biography", true),
        Book(18, "The Alchemist", "Paulo Coelho", "Adventure", true),
        Book(19, "Sapiens", "Yuval Noah Harari", "Non-Fiction", true),
        Book(20, "Educated", "Tara Westover", "Memoir", true)
    )

    private val members = mutableListOf(
        Member(1, "Alice Johnson", "alice.johnson@example.com"),
        Member(2, "Bob Smith", "bob.smith@example.com"),
        Member(3, "Charlie Brown", "charlie.brown@example.com"),
        Member(4, "Diana Prince", "diana.prince@example.com"),
        Member(5, "Edward Norton", "edward.norton@example.com"),
        Member(6, "Fiona Apple", "fiona.apple@example.com"),
        Member(7, "George Clooney", "george.clooney@example.com"),
        Member(8, "Hannah Montana", "hannah.montana@example.com"),
        Member(9, "Ian McKellen", "ian.mckellen@example.com"),
        Member(10, "Julia Roberts", "julia.roberts@example.com")
    )

    private val borrowedBooks = mutableMapOf<Int, Int>() // Maps book ID to member ID

    fun start() {
        println("Welcome to the Library Management System")
        if (!login()) {
            println("Invalid login credentials. Exiting.")
            exitProcess(1)
        }

        while (true) {
            println("\nSelect an option:")
            println("1. View all books")
            println("2. View available books")
            println("3. View all members")
            println("4. Search books")
            println("5. Borrow a book")
            println("6. Return a book")
            println("7. Check borrowed books")
            println("0. Exit")

            when (readLine()?.toIntOrNull()) {
                1 -> viewAllBooks()
                2 -> viewAvailableBooks()
                3 -> viewAllMembers()
                4 -> searchBooks()
                5 -> borrowBook()
                6 -> returnBook()
                7 -> checkBorrowedBooks()
                0 -> {
                    println("Exiting...")
                    exitProcess(0)
                }
                else -> println("Invalid option. Please try again.")
            }
        }
    }

    private fun login(): Boolean {
        print("Enter username: ")
        val username = readLine().orEmpty()
        print("Enter password: ")
        val password = readLine().orEmpty()
        return username == "librarian" && password == "lib 123"
    }

    private fun viewAllBooks() {
        println("\nAll Books:")
        books.forEach { book ->
            println("ID: ${book.id}, Title: ${book.title}, Author: ${book.author}, Genre: ${book.genre}, Available: ${book.available}")
        }
    }

    private fun viewAvailableBooks() {
        println("\nAvailable Books:")
        books.filter { it.available }.forEach { book ->
            println("ID: ${book.id}, Title: ${book.title}, Author: ${book.author}, Genre: ${book.genre}")
        }
    }

    private fun viewAllMembers() {
        println("\nAll Members:")
        members.forEach { member ->
            println("ID: ${member.id}, Name: ${member.name}, Contact Info: ${member.contactInfo}")
        }
    }

    private fun searchBooks() {
        print("Enter title, author, or genre to search: ")
        val query = readLine().orEmpty().lowercase()

        println("\nSearch Results:")
        books.filter {
            it.title.lowercase().contains(query) ||
                    it.author.lowercase().contains(query) ||
                    it.genre.lowercase().contains(query)
        }.forEach { book ->
            println("ID: ${book.id}, Title: ${book.title}, Author: ${book.author}, Genre: ${book.genre}, Available: ${book.available}")
        }
    }

    private fun borrowBook() {
        print("Enter the book ID to borrow: ")
        val bookId = readLine()?.toIntOrNull() ?: return

        print("Enter your member ID: ")
        val memberId = readLine()?.toIntOrNull() ?: return

        val book = books.find { it.id == bookId }
        val member = members.find { it.id == memberId }

        if (book != null && member != null) {
            if (book.available) {
                book.available = false
                borrowedBooks[bookId] = memberId
                println("Book '${book.title}' borrowed by member '${member.name}'.")
            } else {
                println("The book '${book.title}' is already borrowed.")
            }
        } else {
            println("Invalid book ID or member ID.")
        }
    }

    private fun returnBook() {
        print("Enter the book ID to return: ")
        val bookId = readLine()?.toIntOrNull() ?: return

        val book = books.find { it.id == bookId }
        if (book != null) {
            if (!book.available) {
                book.available = true
                borrowedBooks.remove(bookId)
                println("Book '${book.title}' returned successfully.")
            } else {
                println("The book '${book.title}' was not borrowed.")
            }
        } else {
            println("Invalid book ID.")
        }
    }

    private fun checkBorrowedBooks() {
        println("\nBorrowed Books:")
        if (borrowedBooks.isEmpty()) {
            println("No books are currently borrowed.")
        } else {
            borrowedBooks.forEach { (bookId, memberId) ->
                val book = books.find { it.id == bookId }
                val member = members.find { it.id == memberId }
                if (book != null && member != null) {
                    println("Book: '${book.title}' (ID: ${book.id}) is borrowed by '${member.name}' (ID: ${member.id}).")
                }
            }
        }
    }
}

fun main() {
    val system = LibraryManagementSystem()
    system.start()
}
