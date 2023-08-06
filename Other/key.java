package Other;

import java.util.*;

public class key {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();

        int num2 = in.nextInt();

        int num3 = in.nextInt();

        int smallestThousands = Math.min(Math.min(num1 / 1000, num2 / 1000), num3 / 1000);
        int largestHundreds = Math.max(Math.max(num1 / 100 % 10, num2 / 100 % 10), num3 / 100 % 10);
        int smallestTens = Math.min(Math.min(num1 / 10 % 10, num2 / 10 % 10), num3 / 10 % 10);
        int largestUnits = Math.max(Math.max(num1 % 10, num2 % 10), num3 % 10);

        int newNumber = smallestThousands * 1000 + largestHundreds * 100 + smallestTens * 10 + largestUnits;

        System.out.println("The new number is: " + newNumber);

        in.close();
    }
}
