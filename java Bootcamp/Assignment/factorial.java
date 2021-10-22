package Assignment;

import java.util.Scanner;
public class factorial {
     public static void main(String[] args)  {
         int fact =1;
         Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         for(int i = 2; i <= num;i++){
         
             fact = fact*i;

         }
         System.out.println(fact);


         in.close();
     }  
}
