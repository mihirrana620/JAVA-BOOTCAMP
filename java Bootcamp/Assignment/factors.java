package Assignment;
import java.util.Scanner;
public class factors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");

        int num = in.nextInt();
        
        System.out.print("The factors of "+num + " are : ");
        for(int i = 1;i<num;i++){
            if((num % i) == 0){
                System.out.print(i + " ");
            }
        }
            
        

        in.close();
    }
    
}
