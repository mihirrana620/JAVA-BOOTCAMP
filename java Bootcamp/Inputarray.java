import java.util.Scanner;
public class Inputarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 63;
        arr[2] = 123;
        arr[3] = 223;
        arr[4] = 523;
        System.out.println(arr[3]);


        //input using for loop
        for(int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }

        //for(int i = 0; i< arr.length; i++){
        //    System.out.print(arr[i] + " " );
        //}

        for(int num : arr){
            System.out.print(num + " "); // Here num represents element of array
        }

        in.close();

    }
    
}
