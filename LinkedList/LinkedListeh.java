import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListeh {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("hehe");
        list.add("nuuh-uh");

        Scanner in = new Scanner(System.in);

        String[] arr = new String[2];
        for (int i = 0; i < 2; i++) {
            arr[i] = in.next();
        }

        // Adding array to LL
        for (String element : arr) {
            list.add(element);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.print("End");
        in.close();
        System.out.println();
        System.out.println(list.size());

        //linked list to array
        Object[] arr2 = list.toArray();
        System.out.println(Arrays.toString(arr2));
        System.out.println(list.getFirst());
    }
}
