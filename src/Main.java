public class BankAccount {

    private static final String BANK_NAME = "Liceo Bank";
    private static final double INTEREST_RATE = 0.03;
    
    private static int totalAccounts = 0;
    private static int accountNumberGenerator = 1000;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public static String generateAccountNumber() {
        return "LB" + (accountNumberGenerator++);
    }

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(0, initialBalance);
        totalAccounts++;  
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: ₱%.2f%n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn: ₱%.2f%n", amount);
        }
    }

    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    public void displayAccountInfo() {
        System.out.println("=== Account Information ===");
        System.out.println("Bank: " + BANK_NAME);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.printf("Balance: ₱%.2f%n", balance);
        System.out.printf("Interest (%.0f%%): ₱%.2f%n", INTEREST_RATE * 100, calculateInterest());
        System.out.println();
    }


    public static void displayTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
