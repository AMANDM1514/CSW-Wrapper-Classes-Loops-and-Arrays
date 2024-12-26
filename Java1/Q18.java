// Q18) Write java program to find the Kth largest and Kth smallest number in an array.


import java.util.Arrays;
import java.util.Scanner;

public class KthLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter K: ");
        int k = scanner.nextInt();

        Arrays.sort(array);

        if (k <= n) {
            System.out.println(k + "th smallest number: " + array[k - 1]);
            System.out.println(k + "th largest number: " + array[n - k]);
        } else {
            System.out.println("K is
