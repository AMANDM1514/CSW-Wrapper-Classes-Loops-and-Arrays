// Q15) Write a program to calculate the sum of following series where n is input by user. 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n


import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Sum of the series: " + sum);
    }
}
