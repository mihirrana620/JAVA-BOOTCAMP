package linearsearch;

public class Linear_search {
    
        public static void main(String[] args) {
            int[] nums = {23,45,6,74,2,8,6,125,47,69,58,78,26,35};
            int target = 125;
           int ans =  searching(nums,target);
           System.out.println(ans);
           int ans2 =  searching2(nums,target);
           System.out.println(ans2);
          }   
       
       
       //search in the array: return index if item not found
       //otherwise if item not found return -1
       static int searching(int[] arr, int target){
           if (arr.length == 0){
               return -1;
           }
       
           // run a loop
           for(int i = 0; i < arr.length; i++){
               //check for element at every index if it is = target
               int element = arr[i];
               if(element == target){
                 
               return i;
               }
           }
           //this line will execute if none of the return statements are executed
           // hence target not found
           return -1;
         
       }
       static int searching2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
    
        // run a loop
        for(int element : arr){
            //check for element at every index if it is = target
            if(element == target){
              
            return element;
            }
        }
        //this line will execute if none of the return statements are executed
        // hence target not found
        return Integer.MAX_VALUE;
      
    }
       }

