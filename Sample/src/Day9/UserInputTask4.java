package Day9;

import java.util.Scanner;

// 1. write a program that prints word representation of your number
//      where number is 0 <= N <= 3
// ex: 0 => zero
// ex: 3 => three
public class UserInputTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a number[0-3]: ");

        int number = scan.nextInt();
        if(number == 0){
            System.out.println("zero");
        }
        if(number == 1){
            System.out.println("One");
        }
        if(number == 2){
            System.out.println("Two");
        }
        if(number == 3){
            System.out.println("Three");
        }
    }
}
