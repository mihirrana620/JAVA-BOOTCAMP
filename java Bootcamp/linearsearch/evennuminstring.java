package linearsearch;
import java.util.Scanner;;
public class evennuminstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {12,345,2,6,7869};
        System.out.println(findNumbers(nums));
        in.close();
    }
    static int findNumbers(int[] nums){
        
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberofdigits =digits(num);
        if(numberofdigits % 2 == 0){
        return true;
        }
        return false;
    
    }
    static int digits(int num){
        if(num < 0){
            num = num *-1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }

        return count;
    }
    }


