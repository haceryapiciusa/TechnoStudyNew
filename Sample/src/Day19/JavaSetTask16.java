package Day19;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaSetTask16 {
    //16. you have list of numbers, determine if you have duplication there
    //ex: [1, 2, 3, 4, 4, 5, 6]  => has duplications
    //ex2: [1, 2, 3] => no duplications
    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(4);
        listNumbers.add(5);
        listNumbers.add(6);
        System.out.println(listNumbers);

        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(4);
        mySet.add(5);
        mySet.add(6);
        System.out.println(mySet);


        if(listNumbers.contains(mySet)){
            System.out.println("has duplication");
        }
        else System.out.println("no duplication");


    }

}
