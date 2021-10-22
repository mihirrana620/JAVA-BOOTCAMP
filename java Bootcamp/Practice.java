import java.util.Scanner;
import java.lang.Math;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // int sum = 0;
            int sum2 = 0;
            for (int j = 0; j <= n - 1; j++) {

                sum2 += (int) (Math.pow(2, j) * b);
                System.out.print(sum2 + a + " ");
            }

        }
        in.close();
    }

}
