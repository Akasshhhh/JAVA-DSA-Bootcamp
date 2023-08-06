package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<Integer>());
        }

        // Adding elements into Arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
        in.close();
    }
}
