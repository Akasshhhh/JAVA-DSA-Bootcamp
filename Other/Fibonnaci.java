package Other;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        // Fibonnaci series
        // 0,1,1,2,3,5,8,13,21,34.....
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() - 2;
        for (int i = 0; i <= n; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(sum + "  ");
        }
        in.close();

    }
}
