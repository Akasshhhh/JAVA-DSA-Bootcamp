import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Syntax
        // We cannot pass primitive data types we need to pass wrapper classes such as
        // String, Integer
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // To add elements into it we have a method called .add
        dynamicArray.add(34);
        dynamicArray.add(22);

        // User input
        for (int i = 2; i < 10; i++) {
            dynamicArray.add(in.nextInt());
        }

        // We can directly printout this array using sout
        System.out.println(dynamicArray);

        // We can use contains method to check if the specified element is present or
        // not in array
        System.out.println(dynamicArray.contains(34));
        System.out.println(dynamicArray.contains(1));

        // We can update any index we want by set method
        // Syntax
        // Array.set(index to be updated, value)
        dynamicArray.set(0, 79);
        System.out.println(dynamicArray);

        // Remove the element from any given index
        // Syntax
        // Array.remove(index)
        dynamicArray.remove(1);
        System.out.println(dynamicArray);

        // To get item from any index we use get method
        System.out.println(dynamicArray.get(5));
        in.close();
    }
}
