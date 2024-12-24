// Q5) Write a program to read an integer as a string and convert it to an Integer object.

package Assignment_Q;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Integer int1 = Integer.valueOf(str);
        System.out.println(int1);
    }
}
