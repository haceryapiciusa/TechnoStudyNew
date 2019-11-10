package Day22_Practice;
// 4. Write a Java program to test if an array contains a specific value
public class Task4 {
    public static void main(String[] args) {
        int [] array = {1,23,34,45,34,645,6,45};
        for (int i : array) {
            if (i ==34){
                System.out.println("i have it");
            }
        }
        System.out.println();
    }
}
