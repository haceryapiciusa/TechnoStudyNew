package Day_23practice;

import java.util.Arrays;

public class Task5 {
    // Write a Java program to find the second largest element in an array.
    // {1, 34, 66, 1000, 23, 4, 7, 9} => 66
    public static void main(String[] args) {
        int[] intArray = {1, 34, 66, 1000, 23, 4, 7, 9};
        int second = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                second=max;
                max = intArray[i];
            }

        }System.out.println(second);

        Arrays.sort(intArray);
        System.out.println("second number: "+intArray[intArray.length-2]);

    }
}