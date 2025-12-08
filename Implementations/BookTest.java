// Public class matching the file name
public class BookTest {
    public static void main(String[] args) {
        // Create a RefactoredBook object
        RefactoredBook myBook = new RefactoredBook("The Alchemist", "Paulo Coelho");

        // Access title using getter
        System.out.println("Title: " + myBook.getTitle());

        // Change title using setter
        myBook.setTitle("Brida");

        // Display updated info
        myBook.displayInfo();
    }
}

// Non-public class in the same file
class RefactoredBook {
    private String title;
    private String author;

    // Constructor
    public RefactoredBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Book: " + title + " Author: " + author);
    }
}
