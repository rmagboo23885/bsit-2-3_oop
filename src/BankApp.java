public class BankApp {
    public static void main(String[] args) {
    BankAccount acc1 = new BankAccount("Ralph Jay", 30000);
    BankAccount acc2 = new BankAccount("Arjay Scofield", 25000);
    BankAccount acc3 = new BankAccount("Coach Joshua", 15000);  

    acc1.deposit(1200);
    acc1.withdraw(850);
    acc1.displayAccountInfo();

    acc2.deposit(3000);
    acc2.withdraw(250);
    acc2.displayAccountInfo();

    acc3.deposit(1000);
    acc3.withdraw(300);
    acc3.displayAccountInfo();

    System.out.println("Total accounts created: " + BankAccount.totalAccounts);
}
}
