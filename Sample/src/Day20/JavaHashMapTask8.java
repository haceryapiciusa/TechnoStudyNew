package Day20;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask8 {
    //8. Write a Java program to test if a
    //   map contains a mapping for the specified value.
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("map 1: " + map);

        String value = "Black";
        if(map.containsValue(value)){
            System.out.println("it has ");
        }else {
            System.out.println("it doesnt have");
        }
        for(Map.Entry<Integer,String>entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value1 = entry.getValue();
            if (value1.equals("Black")) {
                System.out.println("key is:" + key);
            }
            else {
                System.out.println("dont have");
            }
        }
    }
}
