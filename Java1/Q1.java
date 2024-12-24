// Q1) Write a program to convert an integer to an Integer object.
// (a) Autoboxing
// (b) Using Constructor

package Assignment_Q;
public class Q1 {
    public static void main(String[] args) {
        int a = 17;
        // [a]
        Integer int1 = a;
        System.out.println(int1);

        // [b]
        Integer int2 = new Integer(a);
        System.out.println(int2);
    }
}
