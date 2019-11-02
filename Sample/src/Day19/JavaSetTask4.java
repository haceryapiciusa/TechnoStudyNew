package Day19;

import java.util.HashSet;

public class JavaSetTask4 {
    //4. Write a Java program to empty an hash set.
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

//        numbers.removeAll(numbers);
//        System.out.println(numbers);

//        numbers.clear();
//        System.out.println(numbers);
        HashSet<Integer> numbernew = new HashSet<>();
        numbernew.add(1);
        numbernew.add(2);


        numbers.removeAll(numbernew);
        System.out.println(numbers);


    }
}
