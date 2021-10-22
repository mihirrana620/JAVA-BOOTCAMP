import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        
       // trim is used to remove the extra space
       // System.out.println(in.next().trim());

       // String word = "hello";
       // System.out.println(word.charAt(0));

       char ch = in.next().trim().charAt(0);

       if(ch >= 'a' && ch <= 'z'){

       System.out.println("Lowercase");} else{
        System.out.println("Uppercase");
       }
         
       in.close();
    }
    
}
