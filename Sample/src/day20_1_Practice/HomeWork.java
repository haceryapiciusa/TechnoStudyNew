package day20_1_Practice;

import java.util.HashMap;

public class HomeWork {
    public static void main(String[] args) {
        //task 18 4
        //part4
        // when you are putting check if you have that letter already, if you have, increment value

        //part5
        //print HashMap

        //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
        //part 1
        // print every character in separate line

        String str = "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS";

        System.out.println("1st=======");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println("  \n4th=======");
        HashMap<Character, Integer> myMap2 = new HashMap<>();
        char[] letters = str.toCharArray();


        for (int i = 0; i < str.length() ; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                }
            }
            char ch = str.charAt(i);
            myMap2.put(ch, 0);
        }

        System.out.println(myMap2);
    }
}
