// Q16) Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.


import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        String choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
            System.out.print("Do you want to enter another number? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
