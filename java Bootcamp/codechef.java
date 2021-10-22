import java.util.Scanner;

public class codechef {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int T = in.nextInt();
	for(int i = 0; i< T; i++){
		int[] arr = new int[5];
		int countIndia = 0;
		int countEngland = 0;
		
		for(int j = 0; j < arr.length ;j++){
		 arr[j] = in.nextInt();
	}
		
		for(int j = 0; j < arr.length ;j++){
		  if(arr[j] == 1){
			  countIndia++;
		  }
		  if(arr[j] == 2){
			  countEngland++;
		  }
		}

		if(countIndia> countEngland){
			System.out.println("INDIA");
		}
		else if(countEngland > countIndia){
			System.out.println("ENGLAND");
		}
        else{
			System.out.println("DRAW");
		}
    }
	in.close();
 }
}



