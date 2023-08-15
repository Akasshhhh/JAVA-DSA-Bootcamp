
public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibonacci(7);
        System.out.println(ans);
    }

    static int fibonacci(int n) {
        // base case
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // this is reccurence relation
    }
}

// Formula you create to solve using recursion is known as recurrence relation

// Why recursion ?
// It helps us in solving complex problems in a simpler way