package Day22_Practice;
// write a java program that print array in this manner
// using while loop
// {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//part1:
//            1 10
//            2 9
//            3 8
//            4 7
//            5 6
//            6 5
//            7 4
//            8 3
//            9 2
//            10 1
//part2:
//  1 10
//  2 9
//  3 8
//  4 7
//  5 6

public class Task11 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int i = intArray.length-1;
        int c =0;
        while (i>=0 && c>=0){
            System.out.println(intArray[c]+ " "+ intArray[i]);
            i--;
            c++;
        }
    }
}
