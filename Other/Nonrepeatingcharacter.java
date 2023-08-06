package Other;

import java.util.Scanner;

public class Nonrepeatingcharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char[] arr = input.toCharArray();
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            boolean isUnique = true;
            for (int j = 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;

                }
            }
            if (isUnique) {
                System.out.println(i);
                break;
            }
        }
        in.close();
    }

}
