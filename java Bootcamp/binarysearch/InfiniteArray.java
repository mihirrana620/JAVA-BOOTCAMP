// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

package binarysearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,140, 160, 170};
        
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end  = 1;
       
        // condition for target to lie in the range
        while(target > arr[end]){
            int temp = end + 1;

            //double the box value
            // end  = previous end + sizeofbox*2
            end  = end + (end - start + 1 )*2;
            start = temp;
        }
        return binarysearch(arr, target, start, end);
    }
    static int binarysearch(int[] arr,int target,int start, int end){


        while(start <= end){
            //Find the middle element
          // int mid = (start + end)/2;  // might be possible if mid value exceeds the range of int

          int mid = start + (end -start)/2;

          if(target < arr[mid]){
              end = mid - 1;
          }else if (target> arr[mid]){
              start = mid +1;
          }else{
              return mid;
          }
        }
        return -1;
    }
}