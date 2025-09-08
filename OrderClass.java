import java.util.ArrayList;

public class OrderClass {
    private String customerName;
    private ArrayList<String> items;
    private ArrayList<Double> prices;
    private String size;
    private static int totalOrders = 0;
    private static double largestOrderTotal = 0.0;
    private static String largestOrderCustomer = "";

    public OrderClass(String customerName, String size) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.size = size;
        totalOrders++;
    }

    public void addItem(String item, double price) {
        try {

            if (price <= 0) {
                throw new IllegalArgumentException("Invalid price: must be greater than 0");
            }

            if (item.isEmpty()) {
                throw new IllegalArgumentException("Invalid item: cannot be empty");
            }
            items.add(item);
            prices.add(price);
            System.out.println("Item '" + item + "' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public double calculateTotal() {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }

        if (total > largestOrderTotal) {
            largestOrderTotal = total;
            largestOrderCustomer = customerName;
        }

        return total;
    }
    public void displayOrder() {
        double total = calculateTotal();
        System.out.println("Order for " + customerName + ": " + items.size() + " items, Total: $" + total + ", Size: " + size);
    }
    public static void displayOrderSummary() {
        System.out.println("\nTotal orders created: " + totalOrders);
        System.out.println("Largest order: " + largestOrderCustomer + " ($" + largestOrderTotal + ")");
    }
}
