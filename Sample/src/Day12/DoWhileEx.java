package Day12;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin;
        do {
            System.out.println("WRITE YOUR PIN:");

            pin = scan.nextInt();
        }while (pin != 9999);


        System.out.println("Take you card");
    }
}
