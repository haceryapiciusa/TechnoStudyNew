package Day_23practice;

public class Task61 {
    // Given an array of ints,
    // print true if it  contains no 4's.
    public static void main(String[] args) {
        int[] intArray = {1, 34, 66, 1000, 23, 4, 7, 9};

        for (int i : intArray) {
            if (i == 4 ) {
                System.out.println("it contains four ");
            }

        } System.out.println();
    }

}

