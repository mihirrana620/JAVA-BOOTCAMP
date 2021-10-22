package Assignment.Functions;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age");
        int a = in.nextInt();
        voting(a);
        in.close();
    }

    static void voting(int a) {
        if (a >= 18) {
            System.out.println("You are eligible to vote.");
        } else if (a < 18 && a >0) {
            System.out.println("You are not eligible to vote.");
        }

        else if (a < 0) {
            System.out.println("You are not born");
        }

    }

}
