package Day19;

import java.util.ArrayList;

public class ArrayListTask1 {
    //1. Write a Java program to create a new array list,
    // add some colors (string) and print out the collection.
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList();
        colors.add("Red");
        colors.add("white");
        colors.add("Black");
        colors.add("Green");
        System.out.println(colors);

        //2. Write a Java program to iterate through all elements in a array list.
        //Hint: print your every color in new line

        System.out.println("1. way -----------------------------------");
        //for-each
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("2. way -----------------------------------");
        //for-i
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("3. way -----------------------------------");
        //.forEach method
        colors.forEach(color -> System.out.println(color));

        colors.add(0,"Yellow");
        System.out.println(colors);


    }

}
