package Other;

import java.util.Arrays;

public class panagram {
    public static void main(String[] args) {
        String str = "dshvufhi";
        str = str.replaceAll("\\s", "");
        char[] newStr = str.trim().toLowerCase().toCharArray();
        System.out.println(Arrays.toString(newStr));

        boolean[] foundChars = new boolean[26]; // Array to track if each character is found

        for (int i = 0; i < newStr.length; i++) {
            int index = newStr[i] - 'a';
            foundChars[index] = true;
        }

        boolean isPanagram = true;

        for (boolean found : foundChars) {
            if (!found) {
                isPanagram = false;
                break;
            }
        }

        if (isPanagram) {
            System.out.println("It is a pangram");
        } else {
            System.out.println("Not a pangram");
        }
    }
}
