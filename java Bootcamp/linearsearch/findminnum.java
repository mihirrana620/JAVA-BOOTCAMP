package linearsearch;

public class findminnum {
    public static void main(String[] args) {
    int[] nums = {23,45,6,74,2,8,6,125,-47,69,58,78,26,35};
    System.out.println(min(nums));
    }

    static int min(int[] nums) {
        // assume arr.length ! = 0;
        int temp = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < temp){
                temp = nums[i];
            }
        }
        return temp;
    }
}
