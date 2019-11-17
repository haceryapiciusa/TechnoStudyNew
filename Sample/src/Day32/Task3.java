package Day32;

import java.util.ArrayList;

public class Task3 {
    // Write a program with a method named printAverage
    // that accepts ArrayList of integers as an argument and print its average.
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(5);
        myList.add(9);
        printAverage(myList);
    }

    public static void printAverage(ArrayList<Integer> number) {
        int sum = 0;
        for (Integer list : number) {
            sum += list;
        }
        double average = (double) sum/number.size();
        System.out.println("Average is : "+ average);


    }
}
