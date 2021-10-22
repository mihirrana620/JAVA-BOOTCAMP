package Assignment;
import java.util.Scanner;
public class Simpleinterest {

    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    float principle = in.nextFloat();
    float rate  = in.nextFloat();
    int timeperiod = in.nextInt();

    float totalamount =  ((principle*rate*timeperiod)/100);

    System.out.println(totalamount);
    

    in.close();
    }
}
