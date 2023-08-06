package Other;

import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {
        // We have to check whether the input is lowercase or uppercase
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
        in.close();

    }
}
