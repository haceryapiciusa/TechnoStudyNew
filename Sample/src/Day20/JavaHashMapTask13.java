package Day20;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask13 {
    //13. calculate sum of items,
    //  size of map should be at least 5
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            sum+=value;
        }System.out.println("Sum items: " + sum);
    }
}