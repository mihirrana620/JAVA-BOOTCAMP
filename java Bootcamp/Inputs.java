import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
      // System.out.print("please enter some input : ");
      // int rollno = input.nextInt();
      // input.close();
      // System.out.println("Your roll no is "+rollno);

      //int a = 234_000_000;
      //System.out.println(a);
       String name = input.nextLine();
       System.out.println(name);

       float marks = input.nextFloat();
       System.out.print(marks);
       input.close();
       
    }
}
