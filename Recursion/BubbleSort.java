

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 5, 2, 1 };
        RecBubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void RecBubbleSort(int[] arr, int size, int index) {
        if (size < 1) {
            return;
        }

        if (index < size) {
            if (arr[index] > arr[index + 1]) {
                // swap
                int temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }

            RecBubbleSort(arr, size, index + 1);
        } else {
            RecBubbleSort(arr, size - 1, 0);
        }
    }
}
