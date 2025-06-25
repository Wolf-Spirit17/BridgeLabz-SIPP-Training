public class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter for author
    public String getAuthor() {
        return author;
    }

    // Subclass: EBook
    public static class EBook extends Book {
        private double fileSizeMB;

        public EBook(String ISBN, String title, String author, double fileSizeMB) {
            super(ISBN, title, author);
            this.fileSizeMB = fileSizeMB;
        }

        // Method to display EBook details
        public void displayDetails() {
            System.out.println("ISBN: " + ISBN);        // public: accessible
            System.out.println("Title: " + title);      // protected: accessible in subclass
            // System.out.println("Author: " + author); // ❌ private: not accessible
            System.out.println("File Size: " + fileSizeMB + " MB");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 2.5);

        ebook.displayDetails();

        // Accessing author via public getter
        System.out.println("Author: " + ebook.getAuthor());

        // Modifying author via public setter
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
