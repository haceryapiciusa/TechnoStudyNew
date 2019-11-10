package Day22_Practice;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Task1 {
    public static void main(String[] args) {
        int [] array = {1,4,54,23};
        String [] names = {"Zeynep","Serkan","Bayram"};
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(4);
//        arrayList.add(10);
//        arrayList.add(12);
//        arrayList.add(0);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);
//
//        ArrayList<String>arrayList1 = new ArrayList<>();
//        arrayList1.add("Zeynep");
//        arrayList1.add("Serkan");
//        arrayList1.add("Bayram");
//        Collections.sort(arrayList1);
//        System.out.println(arrayList1);

        System.out.println("First Numeric array : "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted Numeric array : "+Arrays.toString(array));


        System.out.println("First String array : "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted String array : "+ Arrays.toString(names));


    }
}
