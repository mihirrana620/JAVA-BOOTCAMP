package Assignment;
import java.util.Scanner;
public class arithematicoperation {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter which operation you want to perform");
    char operator = in.next().trim().charAt(0);
    System.out.println("Enter Two Numbers");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    if(operator == '+'){
        System.out.println(num1 + num2);
    }
    if(operator == '-'){
        System.out.println(num1 - num2);
    }
    if(operator ==  '*'){
        System.out.println(num1 * num2);
    }
    if(operator == '/'){
        if(num2 != 0){
            System.out.println(num1 / num2);
         } 
        else{
            System.out.println("Invalid input");
        }
    }

    
    in.close();

    }
}
