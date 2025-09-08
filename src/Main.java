public class Main {
    public static void main(String[] args) {
        System.out.println("Creating orders and adding items...\n");

        BookClass order1 = new BookClass("Alice Johnson", "Small");
        order1.addItem("Burger", 8.246666666666667);
        order1.addItem("Fries", 8.246666666666667);
        order1.addItem("Fries", 8.246666666666667);
        BookClass order2 = new BookClass("Bob Smith", "Medium");
        order2.addItem("Pizza", 12.99);
        order2.addItem("Burger", 8.99);
        order2.addItem("Fries", 6.50);
        order2.addItem("Soda", 1.97);
        order2.addItem("Salad", 2.0);

        BookClass order3 = new BookClass("Charlie Brown", "Small");
        order3.addItem("Pizza", 7.75);
        order3.addItem("Fries", 7.75);

        order1.addItem("", 5.00);
        order2.addItem("Taco", -1);

        System.out.println("\nOrder Results:");
        order1.displayOrder();
        order2.displayOrder();
        order3.displayOrder();

        BookClass.displayOrderSummary();
    }
}
