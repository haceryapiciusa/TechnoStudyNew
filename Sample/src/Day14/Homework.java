package Day14;

public class Homework {
    public static void main(String[] args) {
        //Task 1. write a for loop that finds an maximum for the array
        //Task 2. write a for loop that finds an minimum for the array
        //Task 3. write a for loop that finds an average for the array
        // int[] myArray = {34,5,6,2,3,78,1}
        //OUTPUT: average: (34+5+6+2+3+78+1)/7

        int[] myArray = {34, 5, 6, 2, 3, 78, 1};
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println(min);

        int max = myArray[0];
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println(max);
        double sum = 0;
        double average = 0 ;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
            average=  (sum/myArray.length);
        }
        System.out.println(sum);
        System.out.println(average);


    }


}
