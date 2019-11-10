package Day22_Practice;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        //6. Write a Java program to sort in reverse order a numeric array and a string array.

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(2);
//        arrayList.add(34);
//        arrayList.add(45);
//        arrayList.add(21);
//
//        Collections.sort(arrayList);
//        System.out.println(arrayList);


        int [] array = {1,23,34,45,34,645,6,45};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for(int i = array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }


    }
}