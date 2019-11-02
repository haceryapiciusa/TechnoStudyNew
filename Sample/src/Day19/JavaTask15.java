package Day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class JavaTask15 {
    //15. Populate you hash set with random numbers
    //    you hashSet size <= 100
    //    random numbers must be between 0-50
    //add random number to Set 100 times

    public static void main(String[] args) {

        // Hint:
        // 1. create set
        // 2. iterate 100 times
        // 3. add number to set

        Random rand = new Random();

        HashSet<Integer> number = new HashSet<>(50);
        ArrayList<Integer> myList = new ArrayList<>();


        for (int i = 0; i < 50; i++) {
            int randomNumber = rand.nextInt(10);
            number.add(rand.nextInt(10));
            number.add(randomNumber);
            myList.add(randomNumber);
        }
        System.out.println("myList: " + myList);
        System.out.println("mySet: " + number);

    }
}
