package Day15;

public class HomeWork2 {
    public static void main(String[] args) {

//        //kac array oldugunu check ettik
//        boolean haveFive = false;
//        for (int i = 6; i < 10; i++) {
//            if (i == 5) {
//                haveFive = true;
//            }
//        }
//
//        if(haveFive) {
//            System.out.println("you have 5 in array");
//        }else{
//            System.out.println("you dont have");
//        }


        // part.1 Given an array of ints, print "has 1" if there is a 1 in the array

        // part 2. Given an array of ints, print "has 1 and 2" if there is a 1 in the array
        //    with a 2 somewhere later in the array.
        // ex1: int[] a= {1,7,4,5,2} => "has 1 and 2"

        // ex2: {1,7,4,5} => "NOTHING HERE"
        // Hint: if you array has 1 and after that somewhere has 2, is should print "has 1 and 2"


//       // part 1
        int[] a = {1, 7, 4, 5, 2};
        boolean have = false;
        for (int i = 0; i < a.length; i++) {
            if (i == 1) {
                have = true;
            }
        }
        if (have) {
            System.out.println("you have 1 in array");
        } else {
            System.out.println("you dont have");
        }


        //part 2
        boolean arrayHasOne = false;
        boolean arrayHasTwo = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                arrayHasOne = true;
            }
            if (a[i] == 2) {
                arrayHasTwo = true;
            }
        }
        if (arrayHasOne) {
            System.out.println("array has 1");
        }
        if (arrayHasTwo) {
            System.out.println("array has 2");
        }


        //part 3
        int[] arr = {3, 11, 24, 3, 4, 5, 2, 1};
        boolean arrHasOne = false;
        boolean arrHasTwo = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arrHasOne = true;
            }
            if (arr[i] == 2) {
                arrHasTwo = true;
            }

        }
        if (arrHasOne) {
            System.out.println("array has 1");
        }
        if (arrHasTwo) {
            System.out.println("array has 2");
        }
        if (arrHasOne && arrHasTwo) {
            System.out.println("array has both numbers");


        }


    }
}