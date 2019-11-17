package Day32;

import java.util.ArrayList;

public class Task4 {
        // Write a program with a method named getSum
        // that accepts ArrayList of integers as an argument and print its sum in main.
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(2);
            list.add(2);
            int sum = getSum(list);
            System.out.println("Sum is: "+ sum);
        }

    public static int getSum(ArrayList<Integer> number) {
            int sum = 0;
        for (Integer n : number) {
            sum+=n;
        }
        return sum;

    }
}
