package Bitwise;

public class oddEven {
    public static void main(String[] args) {
        int a = 11001010;
        if ((a & 1) == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
