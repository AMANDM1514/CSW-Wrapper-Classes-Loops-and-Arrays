// Q12) Write a program that reads an integer number as a sting and converts it to an int base type.


package Assignment_Q;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
