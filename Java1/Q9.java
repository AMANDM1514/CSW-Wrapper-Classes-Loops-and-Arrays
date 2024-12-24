// Q9) Write a program that reads to convert int, float, double, and boolean as string types and convert them to respective object types using the valueOf method.


package Assignment_Q;

import java.util.Scanner;

public class Q9 {

    Integer convertInteger(String n) {
        return Integer.valueOf(n);
    }

    Boolean convert(String n) {
        return Boolean.valueOf(n);
    }

    Float convertFloat(String n) {
        return Float.valueOf(n);
    }

    Double convertDouble(String n) {
        return Double.valueOf(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Q9 obj = new Q9();
        System.out.println("Boolean Expression: " + obj.convert(str));
        System.out.println("Float Expression: " + obj.convertFloat(str));
        System.out.println("Double Expression: " + obj.convertDouble(str));
        System.out.println("Integer Expression: " + obj.convertInteger(str));
    }
}
