public class Book {
    private final String title;
    private final String author;
    private String status; // "available" or "lent"

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = "available"; // Default status is "available"
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setStatus(String status) {
        if (status.equals("available") || status.equals("lent")) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Status must be either 'available' or 'lent'");
        }
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}