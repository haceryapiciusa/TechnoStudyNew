package Day11;

public class ForLoopsContinue {
    public static void main(String[] args) {
        int N = 0;
        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            sum = sum + i;
            N++;
        }

        System.out.println("Sum is :" + sum);
        System.out.println("Average is : " + ((double)sum/N));
    }
}
