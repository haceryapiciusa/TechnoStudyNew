package Day12;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pin;
        do {
            System.out.println("please write pin");
            pin = scan.nextInt();

            if (pin <= 999 || 10000 <= pin) {


                System.out.println("Wrong combination, please use a 4 digit number");
            }
        } while (pin != 9999);

        System.out.println("take your card");
    }
}
