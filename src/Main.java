public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        library.showBooks();

        library.addBook();

        library.removeBook();

        System.out.println("Program completed successfully!");
    }
}
