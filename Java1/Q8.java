// Q8) Write a program to read a boolean as a string and convert it to a Boolean object.
// Explain the concept of converting a base data type to an object type(Wrapping) using the valueOf() method.

package Assignment_Q;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Boolean int1 = Boolean.valueOf(str);
        System.out.println(int1);
    }
}

