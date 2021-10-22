
public class Scope {
    public static void main(String args[]) {
        int a = 10;
        // int b = 20;
        String name = "Kunal";

        {
            // int a = 78 // already initialized outside the block in the same method hence
            // you cannot initialize again
            a = 56; // but you ca change the value
            // int c = 22;
            // Values intialized in this block will remain in this block
            int c = 99;
            name = "Rahul"; // original string is changed
            System.out.println(name);
            System.out.println(c);

        }

        int c = 900;
        System.out.println(c);

        System.out.println(a);
        System.out.println(name);
        // System.out.println(c); // cannot use outside the block

        // Scoping in for loops

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            // int num = 90;
            // int a = 10;
        }
        // System.out.println(i); // outside the scope

    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
