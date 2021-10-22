import java.util.Scanner;

public class Funciton2 {

    public static void main(String[] args) {

        int ans = subtract();
        System.out.println(ans);
        // String message = greet();
        // System.out.println(message);
        String personalised = myGreet("Mihir Rana");
        System.out.println(personalised);

        int ans2 = sum(20, 30);
        System.out.println(ans2);
    }

    // pass the values of numbers when you calling the method in main()
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static int subtract() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        int diff = num1 - num2;
        input.close();
        return diff;

    }

    static String myGreet(String name) {

        // String greeting = "how are you";
        String message = "Hello " + name;

        return message;
    }

}