package Day_23practice;

import java.util.ArrayList;
import java.util.TreeSet;

public class Task11 {
    //    11. Write a Java program to find the duplicate values of an array of string values.
    public static void main(String[] args) {
        String[] strarray = {"red", "blue", "black", "red"};
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("red");
        arrayList.add("blue");
        arrayList.add("black");
        arrayList.add("red");
        System.out.println(arrayList);

        TreeSet<String> arrayList1 = new TreeSet<>();
        arrayList1.addAll(arrayList);
        System.out.println("TreeSet: "+arrayList1);

        if (arrayList.size()==arrayList1.size()){
            System.out.println("there is no dublicate");
        }else {
            System.out.println("there is dublicate");
        }

    }
}
