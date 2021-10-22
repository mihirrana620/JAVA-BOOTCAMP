import java.util.Scanner;
public class loop {
    public static void main(String[] args){
        //Scanner in = new Scanner(System.in)

        /*  
        syntax for loops

        for(initialization;condition;increament/Decrement){
            //body
        }

        */

        // Q: Print numbers from 1 to 5

        for (int num = 1;num<= 5;num++){
            System.out.println(num);
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <=n;num++){
            System.out.print(num + " ");
        }
        in.close();

        // while loops
        /*
        Syntax:
        while(conditon) {
            //body
        }
        */

        int num = 1;
        while(num<=5){
            System.out.println(num);
            num += 1;

        }
    

        // do while

        /* do{

        }while(condition);
              
        */
           
        int k = 1;
        do{
            System.out.println(k);
            k++;
        } while(k<=5);   // It will execute at least one time.


    } 
}
