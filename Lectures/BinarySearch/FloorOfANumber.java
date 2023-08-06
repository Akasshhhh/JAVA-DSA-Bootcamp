package Lectures.BinarySearch;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 12, 23, 45, 56, 76, 78 };
        int target = 24;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
