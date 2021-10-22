package binarysearch;

public class ceiling {


    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Ceiling(arr, target);
        System.out.println(ans);
    }


     // return the index of smallest no greater than target
    
    static int Ceiling(int[] arr,int target){
      //but what if the target is greater than greatest number in the array
      if(target > arr[arr.length - 1]){
        return -1;
    }
        
        int start = 0;
        int end =arr.length -1;


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
        return start;
    }
}
