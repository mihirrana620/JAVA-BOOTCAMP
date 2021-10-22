package Assignment;

import java.util.Scanner;

public class stringinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = in.nextLine();
        System.out.println("Good Morning " + name);

        in.close();
    }

}
