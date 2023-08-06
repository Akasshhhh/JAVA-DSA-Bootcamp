package Methods;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(45);
        fun("Hi bhai");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String a) {
        System.out.println(a);
    }
}

// We can have 2 functions with same name as long as they have different type of
// arguments