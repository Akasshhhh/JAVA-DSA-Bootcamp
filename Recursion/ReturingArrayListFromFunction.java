import java.util.ArrayList;

public class ReturingArrayListFromFunction {
    public static void main(String[] args) {
        int[] arr = {3,7,4,7,32,2,566,8,4,22};
        System.out.println(FindTarget(arr, 4, 0));
    }

    static ArrayList<Integer> FindTarget(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = FindTarget(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
