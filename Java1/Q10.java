// Q10) Write a program to design a simple calculator (only +,-,*,/ operations). The calculator works as follows:
// Input: ”123+345”
// Output: Sum=468
// Input: ”5*10”
// Output: mul=50


package Assignment_Q;
import java.util.Scanner;

public class Q10 {

    void add(String num) {
        int ind = num.indexOf("+");
        int a = Integer.valueOf(num.substring(0, ind));
        int b = Integer.valueOf(num.substring(ind + 1));

        System.out.println("RESULT: " + (a + b));
    }

    void sub(String num) {
        int ind = num.indexOf("-");
        int a = Integer.valueOf(num.substring(0, ind));
        int b = Integer.valueOf(num.substring(ind + 1));

        System.out.println("RESULT: " + (a - b));
    }

    void mul(String num) {
        int ind = num.indexOf("*");
        int a = Integer.valueOf(num.substring(0, ind));
        int b = Integer.valueOf(num.substring(ind + 1));

        System.out.println("RESULT: " + (a * b));
    }

    void div(String num) {
        int ind = num.indexOf("/");
        int a = Integer.valueOf(num.substring(0, ind));
        int b = Integer.valueOf(num.substring(ind + 1));

        System.out.println("RESULT: " + (a / b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your expression: ");
        String str = sc.next();

        Q10 obj = new Q10();

        if (str.contains("+"))
            obj.add(str);
        else if (str.contains("-")) {
            obj.sub(str);

        } else if (str.contains("*")) {
            obj.mul(str);
        } else if (str.contains("/"))
            obj.div(str);
    }
}

