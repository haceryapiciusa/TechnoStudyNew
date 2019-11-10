package Day22_Practice;
//    Write a Java program to print the grid of zeros with length m and n
public class Task3 {
    public static void main(String[] args) {

        int m = 2;
        int n = 2;
        int[][] array = new int[m][n];

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]);
            }System.out.println();
        }



    }
}
