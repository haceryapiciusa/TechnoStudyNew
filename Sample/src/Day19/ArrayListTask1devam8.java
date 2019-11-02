package Day19;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTask1devam8 {
    //8. Write a Java program to sort a given array list.
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("D"); // 0
        letters.add("C");// 1
        letters.add("A"); // 2
        letters.add("B");
        System.out.println("List before sort: "+letters);

        Collections.sort(letters);
        System.out.println("List after sort: "+letters);
    }

}
