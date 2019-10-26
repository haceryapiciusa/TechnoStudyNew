package Day14;

public class Homework2 {
    public static void main(String[] args) {
        //Task 1. write a for loop that finds an maximum for the array
        //Task 2. write a for loop that finds an minimum for the array
        //Task 3. write a for loop that finds an average for the array
        // int[] myArray = {34,5,6,2,3,78,1}
        //OUTPUT: average: (34+5+6+2+3+78+1)/7

//        int[] myArray = {34,5,6,2,3,78,1};
            int[] myArray = {34, 5, 6, 3};

            int max = 3;
            int min = 34;

            for (int i = 0; i < myArray.length; i++) {
                int currentNumber = myArray[i];

                if (currentNumber > max) {
                    max = currentNumber;
                }
                if (currentNumber < min) {
                    min = currentNumber;
                }
            }

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);


        System.out.println("TASK3-------------------------------------");
        int sum = 0;
        for (int currentNumber : myArray) {
            sum += currentNumber;
        }
        double average = (double) sum / myArray.length;
        System.out.println("Average:  " + average);

    }
}

