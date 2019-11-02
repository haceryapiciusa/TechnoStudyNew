package Day19;

import java.util.HashSet;

public class JavaSetTask3 {
    //3. Write a Java program to get the number of elements in a hash set.

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);


        System.out.println( "size: " +numbers.size());

    }

    }
