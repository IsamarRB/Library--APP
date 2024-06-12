import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a new book
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    // Method to set the status of a book
    public void setBookStatus(String title, String status) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setStatus(status);
                System.out.println("Status of '" + title + "' set to '" + status + "'.");
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
    }

    // Method to display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}