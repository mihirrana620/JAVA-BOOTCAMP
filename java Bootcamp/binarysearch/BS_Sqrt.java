package binarysearch;
// https://leetcode.com/problems/sqrtx/
public class BS_Sqrt {
    public static void main(String[] args) {
        
    }


static int mySqrt(int x) {
    if(x == 1){
        return 1;
    }
    int low = 1;
	int high = x/2;
	while(low <= high){
		int mid = low + (high - low) / 2;
		// check if the square of mid is equal to the target. If so then the mid is my answer
		if((long)mid*mid == x){
			return mid;
		}
		// if the square of mid is less than the target, then definitely my sqrt lies in the right half of the search space
		else if((long)mid * mid < x){
			low = mid + 1;
		}
		// else sqrt lies in the left half of the search space
		else{
			high = mid - 1;
		}
	}

	return high;
    }
}