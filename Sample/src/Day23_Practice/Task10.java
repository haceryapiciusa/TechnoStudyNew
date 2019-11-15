package Day23_Practice;

public class Task10 {
    //    10. Write a Java program to find the duplicate values of an array of integer values
    public static void main(String[] args) {
        int[] intArray = {1, 34, 66, 1000, 23, 4, 7, 9,9};
        int counter = 0;
        boolean b = false;
        for (int i : intArray) {
            if (i == 9) {
                b = true;
                counter++;
            }
        }
            if(counter>=2){
                System.out.println("has dublicate");
        }
            else{
                System.out.println("no dublicate");
            }

    }
}
