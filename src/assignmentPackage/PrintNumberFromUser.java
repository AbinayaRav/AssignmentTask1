package assignmentPackage;

import java.util.Scanner;

public class PrintNumberFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userData = scan.nextInt();
        System.out.println("\nUser entered the below number: ");
        System.out.println(userData);
    }
}
