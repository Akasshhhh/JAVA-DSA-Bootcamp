public class RotatedBinarySearch {
    public static void main(String[] args) {
        
    }

    static int rotatedSearch(int[] arr, int target, int start, int end){
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(start > end){
            return -1;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return rotatedSearch(arr, target, start, mid-1);
            }
            else{
                return rotatedSearch(arr, target, mid+1, end);
            }
        }
    }
}
