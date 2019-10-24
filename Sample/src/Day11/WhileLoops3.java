package Day11;

import java.util.Scanner;

public class WhileLoops3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide your surname: ");
        String s = scan.nextLine();

        while (!s.equals("Hacer Yapici")){
            System.out.println("its not correct");
            s= scan.nextLine();
        }

        if (s.equals("Hacer Yapici")) { //s != "exit"
            System.out.println("You provided correct");

        }
    }
}
