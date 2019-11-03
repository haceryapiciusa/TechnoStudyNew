package Day20;

import java.util.HashMap;

public class JavaHashMapTask5 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");
        System.out.println("first map: " + map);

        int key = 3;
        if (map.containsKey(key)) {
            System.out.println("Value is : " + map.get(key));
        } else {
            System.out.println("we dont have");
        }

        if (map.isEmpty()) {
            System.out.println("empty");
        }  else {
            System.out.println("not");
        }
    }
}