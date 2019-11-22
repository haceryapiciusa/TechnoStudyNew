package Day9;

public class MathRandomTask1 {
    public static void main(String[] args) {
        //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));

        // write a program that prints word representation of random number N
        //      where number is 0 <= N <= 3
        // ex: 0 => zero
        // ex: 3 => three
            int min = 0;
            int max = 5;
            int range = max - min;
            int randomInRange = min + (int) (Math.random() * (range + 1));
            System.out.println(randomInRange);

            if (randomInRange == 0) {
                System.out.println("zero");
            }
            if (randomInRange == 1) {
                System.out.println("One");
            }
            if (randomInRange == 2) {
                System.out.println("Two");
            }
            if (randomInRange == 3) {
                System.out.println("Three");
            }

        }
    }

