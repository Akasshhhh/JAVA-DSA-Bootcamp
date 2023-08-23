public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(SearchInRotatedArray(arr, 9, 0, arr.length - 1));
    }

    //Rotated Array : {5,6,7,8,9,1,2,3}

    static int SearchInRotatedArray(int[] arr, int target, int start,int end){

        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return mid;
        }
        //Case I
        if(arr[start] <= arr[mid]){
            if(target <= arr[mid] && target >= arr[start]){
                return SearchInRotatedArray(arr, target, start, mid-1);
            } else{
                return SearchInRotatedArray(arr, target, mid+1, end);
            }
        }
        //Case II
        if(target >= arr[mid] && target <= arr[end]){
            return SearchInRotatedArray(arr, target, mid+1, end);
        }
        //Case III
        return SearchInRotatedArray(arr, target, start, mid-1);
    }
}
