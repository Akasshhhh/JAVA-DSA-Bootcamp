package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 22, 45, 56, 65, 77 };
        int ans = binarySearch(arr, 77, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }

        return binarySearch(arr, target, mid + 1, end);

    }
}
