package Day22_Practice;

// Write a Java program to sum values of an array.
public class Task2 {
    public static void main(String[] args) {
        int [] array = {1,4,54,23};
        int sum = 0;
        for (int i : array) {
            sum+=i;
        }
        System.out.println(sum);

        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            sum2 += number;
        }
        System.out.println(sum2);
        //3.way.  forr -> using for(int i = array.length-1), from reverse
        int sum3 = 0;
        for (int i = array.length - 1; i >= 0; i--){
            int number = array[i];
            sum3 += number;
        }
        System.out.println(sum3);

    }
}


