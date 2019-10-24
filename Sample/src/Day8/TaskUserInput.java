package Day8;

import java.util.Scanner;

public class TaskUserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Provide first number: ");
        int i2 = scan.nextInt();
        // System.out.println("Your first is :"+ " "+i2);
        System.out.println("Provide second number: ");
        int i3 = scan.nextInt();
        int sum = i2+i3;
        //System.out.println("Your second number: "+i3);
        System.out.println("sum of numbers:"+sum);

    }
}
