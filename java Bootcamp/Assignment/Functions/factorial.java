package Assignment.Functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {
            int a = in.nextInt();
            findfactorial(a);
            in.close();
        }
    }

    static void findfactorial(int a) {
        if (a == 0 || a == 1) {
            System.out.println(a + "! = 1");
        } else if (a > 2) {
            int num = 1;
            for (int i = 2; i <= a; i++) {
                num = num * i;
            }
            System.out.println(a + "! = " +num);

        }

    }
}
