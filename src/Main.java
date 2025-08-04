import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        System.out.println("\n===== STUDENT INFORMATION =====");
        System.out.println("Student ID     : " + studentId);
        System.out.println("Student Name   : " + firstName + " " + lastName);
        System.out.println("Course         : " + course);
        System.out.println("Section        : " + section);
        System.out.print("\nEnter Midterm Exam Score: ");
        
        double midterm = scanner.nextDouble();
        System.out.print("Enter Final Exam Score: ");
        
        double finalExam = scanner.nextDouble();
        System.out.print("Enter Project Score: ");
        
        double project = scanner.nextDouble();
        System.out.print("Enter Attendance Percentage: ");
        
        double attendance = scanner.nextDouble();
        double averageScore = (midterm + finalExam + project + attendance) / 4.0;
        String remarks = averageScore < 75 ? "FAILED" : "PASSED";

        System.out.println("\n===== STUDENT SCORES =====");
        System.out.println("Midterm Exam Score    : " + midterm);
        System.out.println("Final Exam Score      : " + finalExam);
        System.out.println("Project Score         : " + project);
        System.out.println("Attendance Percentage : " + attendance);
        System.out.printf("\nAverage Score         : %.2f%n", averageScore);
        System.out.println("Remarks               : " + remarks);

        scanner.close();
    }
}
