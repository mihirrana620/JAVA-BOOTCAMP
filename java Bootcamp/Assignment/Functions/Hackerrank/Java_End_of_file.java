package Assignment.Functions.Hackerrank;
import java.util.Scanner;
public class Java_End_of_file {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       for(int i = 1; in.hasNext()== true; i++){
       System.out.println(i + " " + in.nextLine());
   }

   in.close();
    }
}
