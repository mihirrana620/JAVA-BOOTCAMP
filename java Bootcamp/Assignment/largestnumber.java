package Assignment;
import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println("The largest number is "+num1);
        } else{
            System.out.println("The largest number is "+num2);
        }

        in.close();
    }
    
}
