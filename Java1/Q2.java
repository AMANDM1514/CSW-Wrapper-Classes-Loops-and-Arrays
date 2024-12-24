// Q2) Write a program to convert a float to a Float object.
// (a) Autoboxing
// (b) Using Constructor


package Assignment_Q;
public class Q2 {
    public static void main(String[] args) {
        float b = 45.2f;
        // [a]
        Float float1 = b;
        System.out.println(float1);

        // [b]
        Float float2 = new Float(b);
        System.out.println(float2);
    }
}
