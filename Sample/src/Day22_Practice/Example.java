package Day22_Practice;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        //array
        int [] array = new int[10];
        array[9] = 1000;
//        array[10] = 2000;
        char[] ca = new char[10];
        String[] sa = new String[10];
//        Example[] ea = new Example[10];
        int length = array.length;


        //ArrayList
        ArrayList<Integer> list1 = new ArrayList<>(10);
        list1.add(1000);
        list1.contains(100);


        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A'); // adds element
        list2.size(); // gives length
        list2.clear(); // clear your arrayList'
//        list2.remove('A');
//        list2.get(0);
        list2.isEmpty(); // checks if arrayList is empty
        list2.contains('B');


        ArrayList<String> list3 = new ArrayList<>();
        list3.add("apple");
        list3.add("lemon");
        list3.add("peach");
        list3.add("apple2");
        list3.add("berry");

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("lemon");
        list4.add("peach");

        list3.retainAll(list4);
        System.out.println(list3);




    }
}
