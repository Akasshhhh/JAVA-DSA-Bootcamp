import java.util.Scanner;

public class SumInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = in.nextInt();
        System.out.println("Enter the sum you want ");
        int sum = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.print(arr[i] + " " + arr[j]);
                    break;
                }
            }

        }
        in.close();
    }
}
