// Q4) Write a program to convert a boolean to a Boolean object.
// (a) Autoboxing
// (b) Using Constructor


package Assignment_Q;

public class Q4 {
    public static void main(String[] args) {
        boolean bool = false;

        Boolean bool1 = bool;
        System.out.println(bool1);
        
        Boolean bool2 = new Boolean(bool);
        System.out.println(bool2);
    }
}
