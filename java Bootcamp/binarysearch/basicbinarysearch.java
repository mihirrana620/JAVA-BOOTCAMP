package binarysearch;

public class basicbinarysearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,18,22,45,89};
        int target = -18;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
       
    }


    //return the index 
    //return -1 if it does not exist

    static int binarysearch(int[] arr,int target){
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
        return -1;
    }
}
