import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    private ArrayList<String> bookList;
    private Scanner input;

    public LibraryManager() {
        bookList = new ArrayList<>();
        input = new Scanner(System.in);
        bookList.add("Code sa Hapon");
        bookList.add("CSS sa Mars");
        bookList.add("Loving You in SQL");
    }

    public void showBooks() {
        System.out.println(bookList.isEmpty() 
            ? "The library is currently empty." 
            : "\nCurrent Books in the Library:\n" + bookList);
        System.out.println("Book display completed.\n");
    }

    public void addBook() {
        System.out.print("Enter the title of the book to add: ");
        String title = input.nextLine().trim();
        
        if (title.isEmpty()) {
            System.out.println("Error: Book title cannot be empty.");
        } else if (title.length() < 3) {
            System.out.println("Error: Book title must be at least 3 characters long.");
        } else {
            bookList.add(title);
            System.out.println("Book added successfully.");
        }
        
        System.out.println("Add book operation completed.");
        showBooks();
    }

    public void removeBook() {
        if (bookList.isEmpty()) {
            System.out.println("Cannot remove from an empty library.");
            System.out.println("Remove book operation completed.");
            showBooks();
            return;
        }

        System.out.print("Enter the index of the book to remove (1 to " + bookList.size() + "): ");
        try {
            int index = Integer.parseInt(input.nextLine()) - 1;
            if (index >= 0 && index < bookList.size()) {
                System.out.println("Removed book: " + bookList.remove(index));
            } else {
                System.out.println("Invalid index. No book at that position.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        
        System.out.println("Remove book operation completed.");
        showBooks();
    }

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        manager.showBooks();
        manager.addBook();
        manager.removeBook();
    }
}
