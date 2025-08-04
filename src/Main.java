// BOOK CLASS
public class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    public Book(String title, String author, int pages) {
        title = title;
        author = author;
        pages = pages;
        isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("---- Book Info ----");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
        System.out.print("\n");
    }

    public void borrowBook() {
        isAvailable = false;
        System.out.println("Book Borrowed");
        System.out.println("\n");
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book Returned");
        System.out.print("\n");
    }
}






// MAIN CLASS
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", 279);
        System.out.print("\n");

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}

