import java.util.Scanner;
public class mihir {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int rem = 0;
        int sum = 0;
        int prod = 1;
        while(num > 0){
         rem = num % 10;
         num = num / 10;
         sum += rem;
         prod *= rem;
        }
        
      System.out.println(prod - sum);
     
  
    
}

}
