import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("=== SUM OF 5 NUMBERS ===");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid number: ");
                scanner.next();
            }

            int number = scanner.nextInt();
            total += number;
        }

        System.out.println("\nTotal Sum: " + total);
        scanner.close();
    }
}
