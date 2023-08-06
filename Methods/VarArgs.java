package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(23, 54, 56, 77, 3, 2);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    // we can also take varArgs with fixed args too
    // here a and b are mandatory args
    static void multiple(int a, int b, String... c) {
        System.out.println(a);
    }
}

// Variable length arguments are those function arguments in which we do not
// know how many arguments we will pass to the method
// Can be done by as shown in fun() method
// It stores the argument values in an array