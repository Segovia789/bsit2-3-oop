import java.util.ArrayList;
import java.util.Scanner;

class LibraryManager {
    private ArrayList<String> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }

    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is null");
            }
            System.out.println("\n=== Library Management System ===");
            System.out.println("\n--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.");
        }
    }

    public void addBook() {
        try {
            System.out.print("Enter book title to add: ");
            String title = scanner.nextLine().trim();

            if (title == null || title.isEmpty()) {
                throw new IllegalArgumentException("Error: Book title cannot be empty!");
            }
            if (title.length() < 3) {
                throw new IllegalArgumentException("Error: Book title must be at least 3 characters long!");
            }

            books.add(title);
            System.out.println("Book '" + title + "' added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Add book operation completed.");
            showBooks();
        }
    }

    public void removeBook() {
        try {
            System.out.print("Enter book number to remove (1-" + books.size() + "): ");
            String input = scanner.nextLine();
            int index = Integer.parseInt(input) - 1;

            if (index < 0) {
                throw new IllegalArgumentException("Error: Negative book number is not allowed!");
            }

            if (books.isEmpty()) {
                System.out.println("No books available to remove.");
                return;
            }

            if (index >= books.size()) {
                throw new ArrayIndexOutOfBoundsException("Error: Invalid book number! Please enter between 1 and " + books.size() + ".");
            }

            String removedBook = books.remove(index);
            System.out.println("Book '" + removedBook + "' removed successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.");
            showBooks();
        }
    }
}

