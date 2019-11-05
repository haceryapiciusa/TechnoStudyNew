package Day20;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask14 {
    //14. print
    // Apple Lemon Peach Melon Berry
    // 100 200 150 145 250
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 150);
        map.put("Melon", 145);
        map.put("Berry", 250);
// Hint: use as many loop as you like
//        for(Map.Entry<String, Integer> e : map.entrySet()){
//            System.out.print(e.getKey() + " ");
//        }

//        int sum = 0;
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            Integer value = entry.getValue();
//            sum+=value;
//        }
//        System.out.println(sum);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            System.out.print(key+ " ");
        }
        System.out.println();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            System.out.print(value+ " ");
        }
    }
}
