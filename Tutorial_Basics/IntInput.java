package Tutorial_Basics;

import java.util.Scanner;

public class IntInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollNo = input.nextInt();
        System.out.println("Your roll no is:" + rollNo);
        input.close();
    }

}
