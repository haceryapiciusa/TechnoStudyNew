package Day15;

import java.util.Random;

public class ArrayTask4 {
    //TODO
    // part1. fill array with random values using Random/Math.random, 0 <= random N <= 10
    // part2. check if an array of integers without 0 and 10.
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[5];
        for (int num = 0; num < array.length; num++) {
            array[num] = (int) (Math.random() * 11);
            // array[num] = rand.nextInt(100);
            System.out.println(array[num]);
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {

                System.out.println("Zero is in the array: " + array[i]+ "   index is: " + i );
            }
            else if (array[i]==10) {
                System.out.println("Ten is in the array: " + array[i]+ "    index is: " + i );
            }

        }


    }
}
