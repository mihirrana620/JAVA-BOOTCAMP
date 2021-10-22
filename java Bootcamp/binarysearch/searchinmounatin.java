package binarysearch;
// https://leetcode.com/problems/find-in-mountain-array/
public class searchinmounatin {
    public static void main(String[] args) {
      
    }
 

    int search(int[] arr, int target){
        int peak  = peakIndexInMountainArray(arr);
        int firsttry = OrderagnosticBS(arr, target,0,peak);
        if(firsttry != -1){
         return firsttry;
        }else{
        int secondtry = OrderagnosticBS(arr, target, peak+1, arr.length - 1);
         return secondtry;
        }
    
    }
   
    static int OrderagnosticBS(int[] arr, int target,int start,int end) {
       
        // find whether the array is sorted in ascending or descending

        // Find the middle element
        // int mid = (start + end)/2; // might be possible if mid value exceeds the
        // range of int

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;

    }



    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end -start )/2;

            if(arr[mid] > arr[mid +1]){
               
               end = mid ;
            } else{
              
               start = mid+1;
               
            }
        }
       return start;
    }
}
