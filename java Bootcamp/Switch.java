import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();
        //
        // switch (fruit) {
        // case "mango":
        // System.out.println("King of fruits");
        // break;
        // case "apple":
        // System.out.println("A sweet red fruit");
        // break;
        // case "orange":
        // System.out.println("Round fruit");
        // break;
        // case "grapes":
        // System.out.println("Small fruit");
        // break;
        // default:
        // System.out.println("please enter a valid fruit");
        //
        // in.close();
        //
        // }

        // int day = in.nextInt();
        // switch (day) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // }

        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Mihir Rana");
                break;
            case 2:
                System.out.println("Akshar Rana");
                break;
            case 3:
                System.out.println("emp num 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Managemant Deparment");

                    default:
                        System.out.println("No deparment entered");
                }
                break;
            default:
                System.out.println("enter correct ID");

        }

        in.close();

    }

}
