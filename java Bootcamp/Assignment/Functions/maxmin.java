package Assignment.Functions;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        max(c, d, e);
        min(c, d, e);
        in.close();
    }

    static void max(int a, int b, int c) {
        if ((a > b) && (a > c)) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }

    static void min(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            System.out.println(a);
        } else if (b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}