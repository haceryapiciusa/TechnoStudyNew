package Day17;

public class MultiDimensionalArraysTask3 {
    public static void main(String[] args) {
        //part1. print
        // apple lemon peach
        // red green blue
        //part2, you have to USE 2 LOOP and print:
        // red green blue
        // apple lemon peach
        //part3, you have to USE 2 LOOP and print
        // red apple
        // green lemon
        // blue peach


        String[][] array = {
                {"apple", "lemon", "peach"},
                {"red", "green", "blue"}
        };

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++){
                System.out.print( array[row][col] +" ");
            }
            System.out.println();
        }

        System.out.println("====");


        for (int row =  array.length-1;row>=0; row--) {
            for (int col = 0; col < array[row].length; col++){
                System.out.print( array[row][col] +" ");
            }
            System.out.println();
        }
        System.out.println("====");

        System.out.println("Homework=====>");


        for (int row = 0; row < array.length-1;row++) {
            for (int col = 0;col< array[row].length;col++) {
                System.out.println(array[row+1][col] + " " + array[row][col]);

            }
            System.out.println();
        }
    }

}
