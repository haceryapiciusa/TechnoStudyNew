package Day22_Practice;
import java.util.ArrayList;
public class Task5 {
    // 5. Write a Java program to remove a specific element from an array.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(34);
        arrayList.add(45);
        arrayList.add(21);
        arrayList.remove(0);
        System.out.println(arrayList);
    }
}