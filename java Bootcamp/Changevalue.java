import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args){
        int[] arr = {1,3,2,45,6};
        change(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0] = 99; // if you make a change to the object via this refernce variable, same object will be changed
    }
}
