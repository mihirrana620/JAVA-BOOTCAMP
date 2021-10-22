
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
package binarysearch;



public class Peak_index {
    public static void main(String[] args) {
        
    }



    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end -start )/2;

            if(arr[mid] > arr[mid +1]){
                //you are in decreasing part of array
                //this may be the answer but look at left
                //this is why end != mid -1
               end = mid ;
            } else{
               // you are in ascending part of array
               start = mid+1;
               //because we know that m+1 element is greater than mid element

            }
        }
        // in the end start == end and pointing to largest no because of 2 checks
       // start and end are always trying two find max element in above two checks
       // hence, when they are pointing to just one element i.e max element
       //more elaboration: at every point for start and end, they have the best possible answer till that time
       // and if we are saying only one item is remaining that is the best possible answer
       return start;
    }
}
