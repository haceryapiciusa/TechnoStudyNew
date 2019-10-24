package Day11;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
        //        Scanner scan = new Scanner(System.in);
//        System.out.println("provide a number");
//        int num = scan.nextInt();
//        for(int i = 1; i <= num;i++){
//            System.out.println(i);
//        }

        //task 1 write a program that takes "a" and "b" numbers
        // from console, and show multiplication up to that "a" number
        // ex: a = 3, b = 2
        //     2 => 2 * 1
        //     4 => 2 * 2
        //     6 => 2 * 3
        //    use homework loops and exercise above
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("provide a :");
//        int a = scan.nextInt();
//        System.out.println("Provide b:");
//        int b = scan.nextInt();
//
//        for(int i = 1; i <= a; i++){
//            System.out.println(i * b);
//        }


        // Part1. Write a program which prints even numbers up to 10,
        // where N < 10
        // ex: 0, 2, 4, 6, 8
        // hint:
        // if( x%2 ==0 ) => even
        // else => odd

        // Part2. Continue Part1, but use scanner to provide maximum loop iteration
        // instead of 10 in part1, you should use provided number.

        // Part3. Continue part2, but also provide starting number;



        //part 1
//        for(int i = 0; i < 10; i++){
//            if( i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//        System.out.println("----------------------------------");

        //part 2
        // Scanner scan = new Scanner(System.in);
//        System.out.println("Provide max number: ");
//        int max = scan.nextInt();
//        for(int i = 0; i <= max; i++){
//            if( i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//        System.out.println("----------------------------------");





        Scanner scan = new Scanner(System.in);
        System.out.println("Provide start number : ");
        int num2 = scan.nextInt();
        System.out.println("Provide a number : ");
        int num = scan.nextInt();

        for (int i = num2 ; i < num;i++ ) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
