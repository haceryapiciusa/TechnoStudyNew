package day20_1_Practice;

import java.util.HashMap;

public class PutValue4 {
    // put letters as keys into your HashMap,
    // put value = 0

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        String sentence = "hello";

        char[] chars = sentence.toCharArray();
        for(char c : chars){

            map.put(c , 0);
        }
        System.out.println(map);
    }
    //output
    //{h=0,e=0,l=0,o=0}

}
