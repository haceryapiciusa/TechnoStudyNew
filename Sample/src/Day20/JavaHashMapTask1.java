package Day20;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("red",1);
        map.put("blue",2);
        map.put("green",3);
        map.put("yellow",4);
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            Integer point = entry.getValue();
            System.out.println(name + " " + point);
        }
        System.out.println("map size: " +map.size());




    }
}
