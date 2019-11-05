package Day20;

import java.util.HashMap;

public class JavaHashMapTask17 {
    //17. Given map, update the values
    // Apple 333
    // Lemon 444
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        System.out.println("1st map : " +map);

        map.put("Apple",333);
        map.put("Lemon",444);
        System.out.println("2nd map : " +map);
//part2. suppose you have large map, and you need to check
        // if you have "Apple" there, if you have apple, only then change
        // its value to 500
        // Hint: .contains methods

        if(map.containsKey("Apple")){
            map.put("Apple", 500);
        }
        System.out.println(map);

    }
}


