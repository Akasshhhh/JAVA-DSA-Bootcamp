package Lectures.LinearSearch;

import java.util.Scanner;

//We have to search for a char in a String

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Enter the character you are looking for:");
        char n = in.next().trim().charAt(0);
        System.out.println(str);

        int ans = Search(str, n);
        System.out.println(ans);
        in.close();
    }

    static int Search(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }

        return -1;
    }

}

// We can convert a String array to char array using str.toCharArray() method
