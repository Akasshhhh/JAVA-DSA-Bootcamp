package Other;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = in.nextInt();
        int reversed = 0;
        int rem = 0;
        while (n != 0) {
            rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }

        System.out.println(reversed);
        in.close();
    }
}
