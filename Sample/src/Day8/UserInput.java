package Day8;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* System.out.print("Enter your name: ");

        String name = scan.nextLine();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your lastname: ");
        String name2 = scan.nextLine();

        System.out.println("Welcome " + name +" " +name2 + "!!!");

        System.out.println("-----------------------");
        String s1 = scan.nextLine();
        System.out.println("Your text is: " + s1);

        System.out.println("-----------------------");*/

        // int i1 = scan.nextInt();
        //  System.out.println("Number is :"+ i1);

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int i2 = s1.nextInt();
        System.out.println("Your number is :"+ " "+i2);


    }
}
