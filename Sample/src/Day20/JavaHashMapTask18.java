package Day20;

import java.util.HashMap;
import java.util.HashSet;

public class JavaHashMapTask18 {
    //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
    // for ex:
    // A: 2
    // B: 1
    // ...
    //part 1
    // print every character in separate line

    //part2
    // put every character in HashSet

    //part3
    // put every character in HashMap<Character, Integer>

    //part4
    // when you are putting check if you have that letter already, if you have, increment value

    //part5
    //print HashMap


    public static void main(String[] args) {
        //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
        //part 1
        // print every character in separate line

        String str = "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS";

        System.out.println("1st=======");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
//        System.out.println("2nd=======");
//     //part2
//     // put every character in HashSet
//        HashSet<Character> set = new HashSet<Character>();
//        char [] c= str.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            set.add(c[i]);
//        }
//        System.out.println(set);
        System.out.println("3rd=======");
        //part3
        // put every character in HashMap<Character, Integer>
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char aChar = str.charAt(i);
            map.put(aChar,0);
        }
        System.out.println(map);


        System.out.println("4rd=========");

//        // part 4 & 5: when you are putting character, check if you have that character already,
//        // if you have, increment value, if you don't have just add character to map.
//        // + print the map
//
//        HashMap<Character, Integer> myMap2 = new HashMap<>();
//        char[] letters = words.toCharArray();
//        int num = 0;
//
//        for (int i = 0; i < words.length() ; i++) {
//            for (int j = 0; j < words.length(); j++) {
//                if (words.charAt(i) == words.charAt(j)) {
//                    num++;
//                }
//            }
//            char ch = words.charAt(i);
//            myMap2.put(ch,num);
//
//            // got help from google after this point but I didn't understand the logic :/
//            // + it prints out how many duplicates a letter has but idk why some letters are missing
//            String d = String.valueOf(words.charAt(i)).trim();
//            words = words.replaceAll(d, "");
//            num = 0;
//        }
//
//        System.out.println(myMap2);
        }
    }

