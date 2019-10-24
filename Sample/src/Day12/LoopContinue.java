package Day12;

public class LoopContinue {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(">>>>>:" +i);
            if (i == 5||i ==6) {
                continue;
            }
            System.out.println("Loop iteration: " +i);
        }
        System.out.println("Your number is " + number);
    }
}
