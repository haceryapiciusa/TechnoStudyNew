package Day20;

import java.util.HashMap;

public class JavaHashMapTask4 {
    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("first map: " + map);

        map.clear();
        System.out.println(map);
    }
}