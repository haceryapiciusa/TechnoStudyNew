package Day20;

import java.util.*;

public class JavaHashMapTask16 {
    //16. given map, print it like this:
    // Lemon 200
    // Apple 100
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);

        System.out.println("1st way......................................");
        HashMap<String, Integer> map2 = (HashMap<String, Integer>) map.clone();
        for (Map.Entry m : map2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("2nd way......................................");
        TreeMap<String,Integer> treemap=new TreeMap<String,Integer>(Collections.reverseOrder());
        treemap.put("Apple", 100);
        treemap.put("Lemon", 200);

        for (Map.Entry<String, Integer> e: treemap.entrySet()) {

            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+ " "+value);

        }



        }
}
