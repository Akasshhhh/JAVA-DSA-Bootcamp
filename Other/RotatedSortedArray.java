package Other;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 7, 8, 9, 0, 1, 2, 3, 4 };
        int target = 1;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = pivotElementIndex(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        } else if (nums[pivot] == target) {
            return pivot;
        } else if (nums[0] <= target) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);

    }

    static int pivotElementIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

// There will be 4 cases in rotated sorted numsay for finding pivot
// when nums[mid] > nums[mid+1]
