// Q6) Write a program to read a float as a string and convert it to a Float object.


package Assignment_Q;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Float int1 = Float.valueOf(str);
        System.out.println(int1);
    }
}
