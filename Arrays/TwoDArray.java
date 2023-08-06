import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Array of arrays
        /*
         * 1 2 3 4
         * 5 6 7 8
         */
        // Declaring 2D Arrays on initialization
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };
        System.out.println(arr);
        // 2D Arrays are made up of 1D Arrays
        /*
         * IN 2D Arrays every row is a different array
         * Therefore we can have 2D Arrays with variable size of columns
         * For ex:
         */
        int[][] arr2 = {
                { 34, 56, 67 },
                { 1, 3, 6, 8, 65, 4 },
                { 18, 5, 8, 44 }
        };
        System.out.println(arr2);

        // Taking input in 2D Arrays
        int[][] arr3 = new int[3][3];
        System.out.println(arr3.length); // prints the no of rows
        for (int i = 0; i < arr3.length; i++) {
            // for each column in every row
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = in.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            // for each column in every row
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
            in.close();
        }
    }
}
