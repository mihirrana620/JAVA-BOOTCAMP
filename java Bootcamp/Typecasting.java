import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       //float num = input.nextFloat();
       //System.out.println(num);
       //
       //int num1= (int) (67.56f);
       //System.out.println(num1);

       //int a = 257;
       //byte b = (byte)(a); // 257 % 256 ==1

       //byte c = 40;
       //byte d = 50;
       //byte e = 100;

       //int f = (c * d)/e;
       //System.out.println(f);

        //byte n = 50;
        //n = n *50;    error

        //int number  = 'A';

        System.out.println(3 * 5.556646);
        System.out.println(3 * 5);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/c) - (d * s);
        System.out.println((f * b) + "  " + (i/c)  + " " + (d * s));
        System.out.println(result);
        input.close();
    }
}
