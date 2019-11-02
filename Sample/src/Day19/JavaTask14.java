package Day19;

import java.util.HashSet;

public class JavaTask14 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("apple");
        colors.add("red");
        colors.add("green");
        System.out.println(colors);



        if (colors.contains("red")){
            System.out.println("it has red");
        }
        else{
            System.out.println("it doesnt have red");
        }
    }
}
