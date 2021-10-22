import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistexamples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>();
       // list.add(45);
       // list.add(89);
       // list.add(56);
       // list.add(78);
//
       // System.out.println(list.contains(64));
       // System.out.println(list);
       // list.set(0,99);
       // System.out.println(list);
       // list.remove(3);
       // System.out.println(list);
       

       //input
       for(int i =0; i < 5; i++){
           list.add(in.nextInt());
       }

       for(int i =0; i < 5; i++){
        System.out.println(list.get(i));
    }


       System.out.println(list);
       in.close();
    }
}
