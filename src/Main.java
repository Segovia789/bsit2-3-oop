import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalNumber = 0;
        int number;

        for (int i = 1; i <= 5; i++) {
            
            System.out.print("Enter number " + i + ": ");
            number = scanner.nextInt();
            totalNumber += number;
        }
            System.out.println("\nTotal Number: " + totalNumber);

        scanner.close();

    }
}
