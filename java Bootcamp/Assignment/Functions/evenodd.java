package Assignment.Functions;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
        System.out.println(even_odd(a));
        in.close();

    }

    static String even_odd(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}