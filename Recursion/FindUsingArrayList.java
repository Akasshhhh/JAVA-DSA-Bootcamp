import java.util.ArrayList;

public class FindUsingArrayList {
    public static void main(String[] args) {
        int[] arr = {2,7,3,4,4,9,1,4};
        System.out.println(FindNumber(arr, 4, 0, new ArrayList<>()));
    }

    static ArrayList<Integer> FindNumber(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return FindNumber(arr, target, index+1, list);
    }
}
