package day16;

import java.util.Random;

public class MultiDimrnsionalArraysTask2 {
    //TODO Using 2D Array fill the table of exam
// exam is provided with percentages 0-100%
//              JAVA  Math  English
//    Max      ???      ???       ???
//    Bayram  ???      ???       ???

    ///part1. give number

    public static void main(String[] args) {

        int[][] examResult = {
                {10,20,30},
                {40,50,60},
        };

        for (int i = 0; i < examResult.length; i++) {
            for (int j = 0;j<examResult[i].length;j++) {
                System.out.print( examResult[i][j] + " ");
            }
        }

        //part2.1, assign random numbers to results
        //part1
            int[][] examResult1 = {
                    {100, 100, 100},
                    {100, 100, 100, 100, 100}
            };
            //part2
            System.out.println("Length: " + examResult1[0].length);


            Random random = new Random();
            for (int row = 0; row < examResult.length; row++) {
                for (int col = 0; col < examResult[row].length; col++) {
         //part2.1
                    examResult[row][col] = random.nextInt(100);
                    System.out.print(examResult[row][col]+ " ");
                }
                System.out.println();
            }

        }
}
