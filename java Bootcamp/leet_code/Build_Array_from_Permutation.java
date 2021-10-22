package leet_code;
import java.util.ArrayList;
import java.util.Scanner;

public class Build_Array_from_Permutation {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
    
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0 ; i < 5 ;i++){
        list.add(in.nextInt());
    }
     
    System.err.println(list);

    in.close();
   
    }
}
