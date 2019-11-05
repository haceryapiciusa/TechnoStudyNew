package day20_1_Practice;

import java.util.HashMap;

public class CheckBeforePutValue2 {
    // put letters in your map, value = 0
    // if map contains that letter already print => "I have it"
    public static void main(String[] args) {
        String sentence = "hello";

        HashMap<Character, Integer> letterMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {

           if ( letterMap.containsKey(letter)){
               System.out.println("I have it");
           }else {
//               System.out.println("We dont");

           }letterMap.put(letter, 0);
        }System.out.println(letterMap);

        // {h=0}
    }

}
