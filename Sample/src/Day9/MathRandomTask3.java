package Day9;

public class MathRandomTask3 {
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int randomInRange = min + (int) (Math.random() * (max - min + 1));

        int x = randomInRange;
        System.out.println(x);
        // + plus
        // - minus
        // * multiplication
        //  / divide
        //  % mod
        if (x % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }

    }
}
