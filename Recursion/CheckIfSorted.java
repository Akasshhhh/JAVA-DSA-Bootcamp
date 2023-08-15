
public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr= {1,3,5,9,7,8};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index){
            //base condition
            if(index == arr.length - 1){
                return true;
            }
            return arr[index] < arr[index+1] && isSorted(arr, index+1);
    }
}


//Recursion-Array Questions