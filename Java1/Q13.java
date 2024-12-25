// Q13) Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.


package Assignment_Q;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (i * n));
        }
    }
}

