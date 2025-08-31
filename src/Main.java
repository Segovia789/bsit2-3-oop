public class BankAccount {
    // Static members
    static String bankName = "Liceo Bank";
    static int totalAccounts = 0;
    static double interestRate = 0.03; // 3%

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public static String generateAccountNumber() {
        totalAccounts++;
        return "ACC" + String.format("%03d", totalAccounts);
    }

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountNumber = generateAccountNumber();
        System.out.println("Account Created: " + accountNumber + " for "
                + accountHolderName + " with initial balance: $" + String.format("%.1f", balance));
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolderName + " deposited $" + String.format("%.1f", amount)
                    + ". New balance: $" + String.format("%.1f", balance));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(accountHolderName + " withdrew $" + String.format("%.1f", amount)
                        + ". New balance: $" + String.format("%.1f", balance));
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
}













public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%\n");

        BankAccount acc1 = new BankAccount("John Doe", 1000.0);
        BankAccount acc2 = new BankAccount("Jane Smith", 2500.0);
        BankAccount acc3 = new BankAccount("Bob Johnson", 500.0);

        System.out.println("\n═══ Account Operations ═══");
        acc1.deposit(500.0);
        acc2.withdraw(300.0);

        System.out.println("\n═══ Interest Calculation ═══");
        System.out.println(acc1.getAccountHolderName() + "'s interest: $" + String.format("%.1f", acc1.calculateInterest()));
        System.out.println(acc2.getAccountHolderName() + "'s interest: $" + String.format("%.1f", acc2.calculateInterest()));
        System.out.println(acc3.getAccountHolderName() + "'s interest: $" + String.format("%.1f", acc3.calculateInterest()));

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}
