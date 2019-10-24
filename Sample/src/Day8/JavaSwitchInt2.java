package Day8;

import java.util.Scanner;

public class JavaSwitchInt2 {
    public static void main(String[] args) {
         /* Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number between 1-7");
        int day = scan.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not in range");
                break;
        }*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a day between Monday-Sunday: ");
        String day = scan.nextLine();
        switch (day){
            case "Monday" :
                System.out.println("1");
                break;
            case "Tuesday" :
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thursday" :
                System.out.println("4");
                break;
            case "Friday" :
                System.out.println("5");
                break;
            case "Saturday" :
                System.out.println("6");
                break;
            case "Sunday" :
                System.out.println("7");
                break;
            default:
                System.out.println("not in range");
                break;
        }

    }
}
