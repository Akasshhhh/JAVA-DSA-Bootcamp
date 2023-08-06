package Lectures.LinearSearch;

public class EvenNoofDigits {
    public static void main(String[] args) {

    }

    static int findNumber(int[] nums) {
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] > 0) {
                count++;
                nums[i] /= 10;
            }
            if (count % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}
