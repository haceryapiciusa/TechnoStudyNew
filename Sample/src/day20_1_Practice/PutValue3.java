package day20_1_Practice;

import java.util.HashMap;

public class PutValue3 {
    // Put first names and last names into your map, and print
    public static void main(String[] args) {
        String[] firstNames = {"Max", "Drake", "Susan"};
        String[] lastNames = {"Smith", "Jones", "Miller"};
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0;i<firstNames.length;i++) {
            map.put(firstNames[i],lastNames[i]);
//            String key = firstNames[i];
//            String value = lastNames[i];
//            map.put(key,value);
        }
        System.out.println(map);
        //output:
        //{"Max"="Smith","Drake"="Jones","Susan"="Miller"}
    }

}
