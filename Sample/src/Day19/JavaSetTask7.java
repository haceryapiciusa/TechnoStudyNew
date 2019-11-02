package Day19;

import java.util.HashSet;

public class JavaSetTask7 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);

        System.out.println(numbers);

        Integer [] array = new Integer[numbers.size()];
        numbers.toArray(array);

        for (Integer elements : array) {
            System.out.println(elements);
        }



    }
}