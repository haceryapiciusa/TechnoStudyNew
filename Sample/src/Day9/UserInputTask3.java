package Day9;

import java.util.Scanner;

// Check if your number is positive or negative with Scanner
// where number is -200<=N<=200
// ex: -123 => negative
// ex: 10 => positive
public class UserInputTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a number: ");
        int number = scan.nextInt();

        System.out.println("Your number is: " + number);
        if (number < 0) {
            System.out.println("Negative");
        }
        if (number > 0) {
            System.out.println("Positive");
        }
        if (number == 0) {
            System.out.println("it's ZERO");
        }
    }
}
