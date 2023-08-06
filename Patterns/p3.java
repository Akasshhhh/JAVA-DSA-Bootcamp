package Patterns;

public class p3 {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n) {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
