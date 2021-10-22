package Assignment.Functions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        checkpalindrome(a);
        in.close();
    }

    static void checkpalindrome(int a) {
        int k = a;
        int ans = 0;

        while (a > 0) {
            int rem = a % 10;
            a /= 10;
            ans = ans * 10 + rem;

        }

        if (k == ans) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }
}