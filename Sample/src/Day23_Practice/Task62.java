package Day23_Practice;

public class Task62 {
    // Given an array of ints,
    // print "I have one" outside of loop, if it contains 1's
    // so if you have multiple 1's if should print "I have one" only once
    public static void main(String[] args) {
        int[] intArray = {1, 34, 66, 1000, 23, 4, 7, 9};
        boolean a = false;

        for (int i = 0; i < intArray.length; i++) {
            if (i == 1) {
                a = true;
            }
        }
        if (true) {
            System.out.println("i have one");
        }
    }
}
