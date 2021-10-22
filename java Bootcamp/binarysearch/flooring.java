package binarysearch;

public class flooring {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 8;
        int ans = Flooring(arr, target);
        System.out.println(ans);
    }

    
     // return the index of smallest no less than target
    static int Flooring(int[] arr,int target){
      
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
        return end;
    }
}
