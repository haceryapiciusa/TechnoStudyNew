package Day15;

import java.util.Random;
import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        //TODO
        //part1. using scanner fill array of length 10;
        //part2. print reverse of you array
        //benim yaptigim
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Provide a number: ");
//        int number = scan.nextInt();
//        Random rand = new Random();
//        int[] array = new int[10];
//        for (int num = 0;num < array.length;num++){
//            array[num] = (int)(Math.random()*10);
//            System.out.println(array[num]);
//        }

        Scanner scan = new Scanner(System.in);
        //HINT Part1:
        // create array with 10 length
        // you can assign all ten value in 10 lines or use loop for it
        // use scan.nextInt(); to get number
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Provide number " + i);
            arr[i] = scan.nextInt();
        }
        System.out.println("=======>array: 1" );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //HINT Part2:
        // start from length()-1
        // use i-- to decrement
        System.out.println("=========>reverse: ");
        for (int i = arr.length - 1 ; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


}

