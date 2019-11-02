package Day19;

import java.util.ArrayList;

public class ArrayListTask1devam9 {
    public static void main(String[] args) {
        //9. Write a Java program to copy one array list into another.
        ArrayList<String> list = new ArrayList();
        list.add("Red");
        list.add("white");
        list.add("Black");
        list.add("Green");
        System.out.println("List 1: " +list);


        System.out.println( "List 2: " +list.clone());
    }
}
