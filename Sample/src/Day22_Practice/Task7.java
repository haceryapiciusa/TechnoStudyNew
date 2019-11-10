package Day22_Practice;

import java.util.ArrayList;

public class Task7 {
    // Write a Java program to convert an array to ArrayList
    public static void main(String[] args) {
        int [] array = {1,23,34,45,34,645,6,45};
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (Integer i : array) {
            arrayList.add(i);
        }System.out.println(arrayList);

//        String[] names = {"yasin", "kemal", "suna", "nalan"};
//
//        //1.way
////        List<String> nameList = Arrays.asList(names);
////        System.out.println(nameList);
////        nameList.remove("yasin");
////        System.out.println(nameList);
//
//        //2.way
//        ArrayList<String> nameList = new ArrayList<>();
//        System.out.println(nameList);
//        for(String s : names){
//            nameList.add(s);
//        }
//        System.out.println(nameList);
    }

}
