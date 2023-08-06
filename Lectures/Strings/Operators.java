package Lectures.Strings;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char) ('a' + 3));
        System.out.println((char) (105));
        System.out.println("A" + 1);
        // output : A1 as the int transforms into Integer class and calls toString
        // method
        // We can use "+" operator in java only with primitives or we can use it with
        // complex object as well only if one of the object is a String
        // For ex: System.out.println(new Integer(56) + new ArrayList<>());
    }
}
