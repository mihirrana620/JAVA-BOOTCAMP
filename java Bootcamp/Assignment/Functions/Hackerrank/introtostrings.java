package Assignment.Functions.Hackerrank;

import java.util.Scanner;

public class introtostrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        System.out.println(A.length() + B.length());
        check(A, B);

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
                + B.substring(1));
        in.close();

    }

    static void check(String A, String B) {
        int l = A.length() > B.length() ? B.length() : A.length();
        String str = "";
        for (int i = 0; i < l; i++) {
            if ((int) (A.toLowerCase()).charAt(i) > (int) (B.toLowerCase()).charAt(i)) {
                str = "Yes";
                System.out.println(str);
                break;
            } else if ((A.toLowerCase()).charAt(i) < (B.toLowerCase()).charAt(i)) {
                str = "No";
                System.out.println(str);
                break;
            }
        }
        if (str == "") {
            if (A.length() > B.length()) {
                str = "Yes";
                System.out.println(str);
            } else {
                str = "No";
                System.out.println(str);
            }
        }

    }

}
