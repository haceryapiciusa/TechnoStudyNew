package Day15;

import java.util.Random;

public class ArrayTask1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        for (int num = 0;num < array.length;num++){
            array[num] = (int)(Math.random()*100);
           // array[num] = rand.nextInt(100);
            System.out.println(array[num]);
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
            System.out.println("Sum is: " +sum);

        double average = (double) sum / array.length;
        System.out.println("Average:  " + average);



    }
}
