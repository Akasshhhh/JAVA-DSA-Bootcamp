package Tutorial_Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        input.close();
    }
}

/*
 * For int input : nextInt() is used to take input of int
 * For float input : nextFloat() is used
 * For String input there are 2 ways:
 * 1. Using next() method: It will take one word input till a space occurs
 * For ex : INPUT: Hey Akash
 * OUTPUT : Hey
 * 2. Using nextLine() method: It will take all string including spaces.
 * 
 */