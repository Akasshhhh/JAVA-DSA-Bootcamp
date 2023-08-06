package Lectures.BinarySearch;

//arr = {2,4,5,6,7,11}
//From the given array if the target element is 9 and there is no 9 then we have to return 11
public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 8, 9, 11, 13, 24 };
        int target = 22;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // if target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {

                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
