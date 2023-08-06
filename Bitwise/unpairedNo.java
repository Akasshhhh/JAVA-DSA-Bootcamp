package Bitwise;

public class unpairedNo {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 2 };
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }
        System.out.println(unique);
    }
}
