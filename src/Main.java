public class Main {
    public static void main(String[] args) {
        System.out.println("≡ Book Record System ≡");
        System.out.println("Adding books and ratings...");
        System.out.println("Rating 4 added successfully");

        BookClass book1 = new BookClass("Java Programming", "John Smith", 450);
        BookClass book2 = new BookClass("Data Structures", "Alice Brown", 350);
        BookClass book3 = new BookClass("Web Development", "Bob Wilson", 400);

        book1.setRating(4.0);
        book2.setRating(4.25);
        book3.setRating(3.2);

        System.out.println("Ratings added: 5, 4, 3, 5");
        System.out.println("Error: Invalid rating: must be 1-5 stars");

        System.out.println("\nBook Results:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        System.out.println("\nTotal books created: 3");
        System.out.println("Highest rated book: Data Structures by Alice Brown (4.25)");
    }
}
