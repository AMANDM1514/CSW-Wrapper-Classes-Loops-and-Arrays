// Q14) Write a java program to calculate HCF and LCM of Two given number.



package Assignment_Q;
import java.util.Scanner;

public class Q14 {

    int findLCM(int a, int b) {
        int ans = (a > b) ? a : b;
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Q14 obj = new Q14();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.println(obj.findLCM(a, b));

    }
}
