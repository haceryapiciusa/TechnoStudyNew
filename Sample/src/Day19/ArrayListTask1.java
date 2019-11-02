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

        //3. Write a Java program to insert an element into
        // the array list at the first position.


        colors.add(0,"Yellow");
        System.out.println(colors);
        //4.write you code here
        // print third element in arrayList

        System.out.println(colors.get(3));
        //5. Write a Java program to update specific array element by given element.

        colors.set(2,"Blue");
        System.out.println(colors);
        //6. Write a Java program to remove the third element from a array list.

        colors.remove(3);
        System.out.println(colors);

        //7.Write a Java program to search an element in a array list.
        //1.st way
        boolean containsBlack1 = false;
        for (String color : colors) {
            if (color.equals("Black")) {
                containsBlack1 = true;
            }

        }
        if (containsBlack1) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }

        System.out.println("2. way");
        boolean containsBlack2 = colors.contains("Black");
        if (containsBlack2) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }

        System.out.println("//3rd way");
        System.out.println("it has black color : "+ colors.contains("Black"));










    }

}
