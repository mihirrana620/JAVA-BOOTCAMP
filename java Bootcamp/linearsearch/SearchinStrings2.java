package linearsearch;

public class SearchinStrings2{
    public static void main(String[] args) {
        int[] nums = {23,45,6,74,2,8,6,125,47,69,58,78,26,35};
        int target = 125;
        int start = 3;
        int end = 9;
       int ans =  searching(nums,target,start,end);
       System.out.println(ans);
    }


    static int searching(int[] arr,int target, int start,int end){
        if (arr.length == 0){
            return -1;
        }
    
        // run a loop
        for(int i = start; i <= end; i++){
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
}
