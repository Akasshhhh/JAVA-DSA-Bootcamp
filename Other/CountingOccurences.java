package Other;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Enter the number you want to count the occurence of:");
        int n = in.nextInt();
        int count = 0;
        int rem;
        while (num != 0) {
            rem = num % 10;
            if (rem == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
        in.close();
    }
}
