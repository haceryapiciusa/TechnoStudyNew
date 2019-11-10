package Day22_Practice;

import java.util.ArrayList;

public class Task8 {
    // Write a java program which will
    // add only even numbers to list from array of integers
    // {100,2,4,5,6,7,8,9,10}
    // [2,4,6,8,10]

    // hint: num%2==0 => this is even
    public static void main(String[] args) {
        int [] array = {1,23,34,45,34,645,6,45};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : array) {
            if(i%2==0){
                arrayList.add(i);
            }
        }System.out.println(arrayList);
    }
}
