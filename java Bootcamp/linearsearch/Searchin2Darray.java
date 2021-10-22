package linearsearch;

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        
    
    int[][] arr = {
    {23,4,1},
    {18,12,3,9},
    {78,99,25,34},
    {18,12}
    };

    int target = 99;
    int[] ans = search(arr, target);
    System.out.println(Arrays.toString(ans));
    System.out.println((max(arr)));
   }

    static int[] search(int[][] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int element = arr[i][j];
                if(element == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
   
}
