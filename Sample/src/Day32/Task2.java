package Day32;

import java.util.ArrayList;

public class Task2 {
    // Write a program with a method named printSum
    // that accepts ArrayList of integers as an argument and print its sum.
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(9);
        printSum(myList);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(4);
        secondList.add(90);
        secondList.add(10);
        secondList.add(5);

        printSum(secondList);


        ArrayList<Integer> thirdList = new ArrayList<>();
        thirdList.add(10);
        thirdList.add(100);
        printSum(thirdList);

        getSub(10,20);

    }

    public static void getSub(int a, int b) {
        System.out.println("Sub (b-a) : " +(b-a));

    }

    public static void printSum(ArrayList<Integer>number) {
        int sum = 0;
        for (Integer integer : number) {
            sum+=integer;
        }
        System.out.println("Sum is : "+ sum);
    }
}
