package Day11;

import java.util.Scanner;

public class TernaryOperatorTask2 {
    //find out min number between two inputs, use user input and ternary operator
//    int val1 = 10;
//    int val2 = 20;
//
//    int min =
//    output
//    10
    public static void main(String[] args) {
        System.out.println("Provide two number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        // here the question mark means if
        // : symbol means else
        int min = (a <= b) ? a : b;

        if (a <= b) {
            min = a;
        } else {
            min = b;
        }

        System.out.println(min);
    }
}
