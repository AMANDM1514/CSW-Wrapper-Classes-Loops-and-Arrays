//Q7) Write a program to read a double as a string and convert it to a Double object.

package Assignment_Q;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Double int1 = Double.valueOf(str);
        System.out.println(int1);
    }
}
