package Lectures.BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    // Creating a function which tells the first and last occurence of an element
    // using binary search
    static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans[0] = mid;
                ans[1] = mid;
                // Checking first occurence
                for (int i = mid; i >= 0; i--) {
                    if (target == arr[i]) {
                        ans[0] = i;
                    } else {
                        break;
                    }
                }
                // Checking last occurence
                for (int i = mid; i < arr.length; i++) {
                    if (target == arr[i]) {
                        ans[1] = i;
                    } else {
                        break;
                    }
                }
                break;
            }
        }
        return ans;
    }
}
