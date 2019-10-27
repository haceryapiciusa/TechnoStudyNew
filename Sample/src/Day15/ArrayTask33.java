package Day15;

import java.util.Random;

public class ArrayTask33 {
    //TODO Task
    // part1. fill array with random values
    // part2. print it in reverse order

    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[5];
        for (int num = 0; num < array.length; num++) {
            array[num] = (int) (Math.random() * 10);
            // array[num] = rand.nextInt(100);
            System.out.println( "random: " + array[num]);
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println( "reverse: " + array[i]);
//        }
        for (int i = array.length - 1 ; i >= 0; i--) {
            System.out.println("reverse back: " +  array[i]);
        }
    }
}
