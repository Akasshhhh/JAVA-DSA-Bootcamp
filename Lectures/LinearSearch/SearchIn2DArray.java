package Lectures.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter target element");
        int n = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int[] answer = SearchIn2D(arr, n);
        System.out.println(Arrays.toString(answer));
        in.close();
    }

    static int[] SearchIn2D(int[][] arr, int target) {

        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (target == arr[i][j]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
