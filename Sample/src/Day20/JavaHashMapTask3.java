package Day20;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask3 {
    //3. Write a Java program to copy all of the
    //   mappings from the specified map to another map.

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("first map: "+ map);

        HashMap<Integer, String> map2 = new HashMap<>();
        System.out.println( "new map: " + map.clone());

        map2.putAll(map);
        System.out.println("\nNow values in second map: " + map2);
       // HashMap<Integer, String> map2 = new HashMap<>(map);  second way

        for(Map.Entry<Integer,String>entry : map.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            map2.put(key,value);
            System.out.println("Size of map is: " + map.size());

        }


    }
}