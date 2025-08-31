public class Book {

  private String title = "Becoming Led Zeppelin";
  private String author = "Jimmy Page";
  private int pages = 444;
  private boolean isAvailable;

 
    public Book(String title, String author, int pages) {
        this.title = title;  
        this.author = author;
        this.pages = pages;
        this.isAvailable = true; 
    }


    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("-----------------------------------");
    }


    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book Borrowed: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available right now.");
        }
    }

   
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book Returned: " + title);
        } else {
            System.out.println("The book '" + title + "' is already in the library.");
        }
    }

    public static void main(String[] args) {
     
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 277);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 279);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);


        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();


        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();
    }
}
