package Day9;

public class MathRandomTask2 {
    //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));

    // Check if random number is positive or negative
    // where number is -200<=N<=200
    // ex: -123 => negative
    // ex: 10 => positive
    public static void main(String[] args) {
        int min = -200;
        int max = 200;
        int range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));


        System.out.println(randomInRange);
        if (randomInRange < 0) {
            System.out.println("Negative");
        }
        if (randomInRange > 0) {
            System.out.println("Positive");
        }
        if (randomInRange == 0) {
            System.out.println("it's ZERO");
        }

    }
}
