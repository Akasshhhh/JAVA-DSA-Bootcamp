import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of jagged array");
        int n = in.nextInt();
        int[][] arr = new int[n][];
        // for (int row = 0; row < arr.length; row++) {
        // for (int col = 0; col < arr[row].length; row++) {
        // arr[row][col] = in.nextInt();
        // }
        // }
        /*
         * If we use the above way for taking input in jagged array it throws an error
         * Error: Cannot read the array length because "arr[row]" is null
         * Therefore we do it by other way
         */
        int temp;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the no of columns in " + i + "th row");
            temp = in.nextInt();
            arr[i] = new int[temp];

            System.out.println("Enter the elements in " + i + "th row");
            for (int j = 0; j < temp; j++) {
                arr[i][j] = in.nextInt();
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
