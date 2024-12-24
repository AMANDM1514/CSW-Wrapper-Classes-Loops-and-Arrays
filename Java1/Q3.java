// Q3 Write a program to convert a double to a Double object.
// (a) Autoboxing
// (b) Using Constructor


package Assignment_Q;

public class Q3 {
    public static void main(String[] args) {
        double a = 45.23;
        Double db1 = a;
        System.out.println(db1);

        Double db2 = new Double(a);
        System.out.println(db2);
    }
}
