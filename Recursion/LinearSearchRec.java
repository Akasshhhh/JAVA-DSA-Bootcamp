
import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = { 23, 56, 44, 63, 27, 36 };
        int target = 63;
        int ans = linearSearch(arr, target, 0);
        System.out.println(ans);
        

        //Multiple occurences
        int[] arr2 = {2,4,6,34,77,4,7,8};
        int target2 = 2;
        MultipleLinearSearch(arr2, target2, 0);
        System.out.println(list);
    }

    static int linearSearch(int[] arr, int target, int index) {
        if (arr[index] == target) {
            return index;
        }
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] != target) {
            return linearSearch(arr, target, index + 1);
        }
        return -1;
    }

    // If there are multiple occurences of target element
    static ArrayList<Integer> list = new ArrayList<>();

    static void MultipleLinearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        MultipleLinearSearch(arr, target, index + 1);

    }
}
