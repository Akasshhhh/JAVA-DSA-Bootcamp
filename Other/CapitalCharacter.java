package Other;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] splitStr = input.split("\\s+");

        for (int i = 0; i < splitStr.length; i++) {
            splitStr[i] = splitStr[i].substring(0, 1).toUpperCase() + splitStr[i].substring(1);
        }
        System.out.println();
        System.out.println(Arrays.toString(splitStr));
        for (int i = 0; i < splitStr.length; i++) {
            System.out.print(splitStr[i] + " ");
        }
        in.close();
    }
}
