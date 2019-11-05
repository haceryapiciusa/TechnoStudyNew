package day20_1_Practice;

import java.util.HashMap;

public class ConcatValue {
    // Given map, concatenate map values each time of iteration

    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("A", "b");
//        for (int i = 0; i < 3; i++) {
//            System.out.println(map);
//            String value = map.get("A");
//            map.put("A",map.get("A")+"b");
//        }
//        //output:
//        // {"A"="b"}
//        // {"A"="bb"}
//        // {"A"="bbb"}


        // Given map, increment map values each time of iteration
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);

        String sentence = "ABC";
        for(char c : sentence.toCharArray()){
            System.out.println(map);
            //write you code here
            Integer value = map.get("A");
            map.put("A",value+1);
            //end of you code
        }
        //output:
        // {"A"=0}
        // {"A"=1}
        // {"A"=2}


    }

}
