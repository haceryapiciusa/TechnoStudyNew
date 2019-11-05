package day20_1_Practice;

import java.util.HashMap;

public class PutValue2 {
    public static void main(String[] args) {
        String [] names = {"Max", "Drake", "Susan"};
        HashMap<String,Integer> map = new HashMap<>();
        for (String c : names) {
            //write you code here
            map.put(c,0);
            //end of you code
        }
        System.out.println(map);
    }
}
//output
//{Max=0, Susan=0, Drake=0}
