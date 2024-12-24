// Q11) Write a program that reads a double number as a sting and converts it to a double base type.


package Assignment_Q;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        double num = Double.parseDouble(str);
        System.out.println(num);
    }
}
