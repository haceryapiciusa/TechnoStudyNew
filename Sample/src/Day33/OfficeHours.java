package Day33;

import java.util.ArrayList;
import java.util.Scanner;

public class OfficeHours {

        public ArrayList<Integer> ScannerAddNum () {

            Scanner scan = new Scanner(System.in);

            ArrayList<Integer> myArr = new ArrayList<>();

            for (int i = 0; i < 5; i++) {

                System.out.println("Please enter your number");

                myArr.add(scan.nextInt());

            }
            return myArr;
        }

//    Create a method
//    with scanner add 5 numbers in the arraylist(int) then return arraylist
//
//               24   -    18  = 6
//                       9   11  13  15  18
//
//    second medhod
//    will take the arraylist as a parameter then return the result as int
//
//            conditions
//        if the number is prime then sum it
//
//        if the number is even minus it
//
//        else dont do anything

        public int SumOrMinus (ArrayList < Integer > arr) {

            int result = 0;

            for (int i = 0; i < arr.size(); i++) {
// 2
                int myNum = arr.get(i);

                if (myNum == 2 || myNum == 3 || myNum == 5 || myNum == 7) {

                    result = result + myNum;

                } else if (myNum % 2 != 0 || myNum % 3 != 0 || myNum % 5 != 0 || myNum % 7 != 0) {

                    result = result + myNum;

                } else if (myNum % 2 == 0) {

                    result = result - myNum;

                } else {

                    continue;

                }

            }

            return result;
        }

    }

