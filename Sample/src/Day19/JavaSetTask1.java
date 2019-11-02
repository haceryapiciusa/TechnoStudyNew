package Day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class JavaSetTask1 {
    //1. Write a Java program to append the specified
    // element to the end of a hash set.
    // ex: [1, 2 , 3] you add 10 => [1, 2, 3, 10]
    public static void main(String[] args) {

        ArrayList<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        System.out.println(listNumbers);

        Set<Integer> setNumbers = new HashSet<>();
        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(3);
        setNumbers.add(10);
        setNumbers.add(5);
        setNumbers.add(5);
        setNumbers.add(5);
        setNumbers.add(5);
        setNumbers.add(5);

        System.out.println("new list: "+setNumbers);

    }

}
