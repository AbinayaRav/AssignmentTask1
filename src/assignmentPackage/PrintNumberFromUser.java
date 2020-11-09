package assignmentPackage;

import java.util.Scanner;

public class PrintNumberFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter data: ");
        String userData = scan.nextLine();
        System.out.println("\nUser entered the below data: ");
        System.out.println(userData);
    }
}
