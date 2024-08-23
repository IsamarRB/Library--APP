package F5.biblioteca;

public class User {
    public enum Rol {
        ADMINISTRATOR,
        GUEST
    }

    private final Rol rol;

    public User(String name, Rol rol) {
        this.rol = rol;
    }

    public Rol getRole() {
        return rol;
    }

    // Administrator Methods
    public void addBook(String bookTitle) {
        if (rol == Rol.ADMINISTRATOR) {
            System.out.println("Book added: " + bookTitle);
            // Add book logic here
        } else {
            System.out.println("Access Denied: Only administrators can add books.");
        }
    }

    public void controlStock(String bookTitle, int stock) {
        if (rol == Rol.ADMINISTRATOR) {
            System.out.println("Stock updated for " + bookTitle + ": " + stock);
            // Control stock logic here
        } else {
            System.out.println("Access Denied: Only administrators can control stock.");
        }
    }

    public void manageLoanedBooks(String bookTitle, boolean isReturned) {
        if (rol == Rol.ADMINISTRATOR) {
            if (isReturned) {
                System.out.println("Book returned: " + bookTitle);
                // Book return logic here
            } else {
                System.out.println("Book loaned out: " + bookTitle);
                // Book loan logic here
            }
        } else {
            System.out.println("Access Denied: Only administrators can manage loaned books.");
        }
    }

    // Guest Methods
    public void searchBook(String bookTitle) {
        if (rol == Rol.GUEST) {
            System.out.println("Searching for book: " + bookTitle);
            // Search book logic here
        } else {
            System.out.println("Access Denied: Only guests can search books.");
        }
    }

    public void borrowBook(String bookTitle) {
        if (rol == Rol.GUEST) {
            System.out.println("Borrowing book: " + bookTitle);
            // Borrow book logic here
        } else {
            System.out.println("Access Denied: Only guests can borrow books.");
        }
    }

    public void returnBook(String bookTitle) {
        if (rol == Rol.GUEST) {
            System.out.println("Returning book: " + bookTitle);
            // Return book logic here
        } else {
            System.out.println("Access Denied: Only guests can return books.");
        }
    }
}

