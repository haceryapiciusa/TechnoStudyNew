package Day19;

import java.util.HashSet;

public class JavaSetTask5 {
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

      //  System.out.println(numbers.isEmpty());

        if( numbers.isEmpty()){
            System.out.println("its empty");
        }
        else
            System.out.println("its not empty");

    }
}
