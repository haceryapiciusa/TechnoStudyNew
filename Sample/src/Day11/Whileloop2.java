package Day11;

import java.util.Scanner;

public class Whileloop2 {
    public static void main(String[] args) {
        //        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Write a string");
//        String s = scan.nextLine();
//
//        while (!s.equals("o")) { //s != "exit"
//            System.out.println("Write a string");
//            s = scan.nextLine();
//        }

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Write a string");

        String s1 = scan1.nextLine();

        int lenght = s1.length();
        if (s1.length() >= 10) {
            System.out.println("String is too large");
        }

        while (!s1.equals("quit")) {
            System.out.println("Write a string");
            s1 = scan1.nextLine();


            //part2
            if(s1.length() >= 10){
                System.out.println("string is too large");
            }



        }
    }
}
