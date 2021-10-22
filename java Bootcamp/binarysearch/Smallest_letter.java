package binarysearch;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallest_letter {
    
}

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     
        int start = 0;
        int end =letters.length -1;


        while(start <= end){
            //Find the middle element
 // int mid = (start + end)/2;  // might be possible if mid value exceeds the range of int

          int mid = start + (end -start)/2;
          if(start != letters.length){
          if(target < letters[mid]){
              end = mid - 1;
          }else{
              start = mid +1;
          }
        }
       }
         return letters[start % letters.length];
    }
  }
