
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        greeting();
        sum();

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);

        in.close();
    }
    
    static void greeting(){
        System.out.println("Good morning");
    }

   
}
